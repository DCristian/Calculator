
/**
 *
 * @author Dumitru Cristian
 */
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class Generator extends UnicastRemoteObject implements CalculatorBuzunar_Generator {

    private static int numar_clienti_conectati;

    Generator() throws RemoteException {
    }

    @Override
    public CalculatorBuzunar server_propriu() throws Exception {

        System.out.println("Client nou. Numar clienti : " + ++numar_clienti_conectati);
        return new Conexiune(0);
    }
}

class Conexiune extends UnicastRemoteObject implements CalculatorBuzunar {

    private double valoareCalculata, memorie;

    public Conexiune(double memorie) throws RemoteException {
        this.memorie = memorie;
        valoareCalculata = memorie;
    }

    @Override
    public double valoareCurenta() {
        return valoareCalculata;
    }

    @Override
    public void adunare(double valoare) throws RemoteException {
        valoareCalculata += valoare;
    }

    @Override
    public void scadere(double valoare) throws RemoteException {
        valoareCalculata -= valoare;
    }

    @Override
    public void inmultire(double valoare) throws RemoteException {
        if (valoare == 0) {
            valoareCalculata = 0;
        } else {
            valoareCalculata *= valoare;
        }
    }

    @Override
    public void impartire(double valoare) throws RemoteException {
        valoareCalculata /= valoare;
    }

    @Override
    public void inversare() throws RemoteException {

        if (valoareCalculata != Double.NEGATIVE_INFINITY) {
            valoareCalculata = 1 / valoareCalculata;
        } else {
            valoareCalculata = 0;
        }
    }

    @Override
    public void putere(double valoare) throws RemoteException {
        valoareCalculata = Math.pow(valoareCalculata, valoare);
    }

    static double logGamma(double valoare) {
        double tmp = (valoare - 0.5) * Math.log(valoare + 4.5) - (valoare + 4.5);
        double ser = 1.0 + 76.18009173 / (valoare + 0) - 86.50532033 / (valoare + 1)
                + 24.01409822 / (valoare + 2) - 1.231739516 / (valoare + 3)
                + 0.00120858003 / (valoare + 4) - 0.00000536382 / (valoare + 5);
        return tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
    }

    @Override
    public void factorial() throws RemoteException {

        if (Math.ceil(valoareCalculata) == valoareCalculata && valoareCalculata > 1) {
            double factorial = 1;
            for (double numar = 2; numar <= valoareCalculata && factorial != Double.POSITIVE_INFINITY; numar++) {
                factorial *= numar;
            }
            valoareCalculata = factorial;
        } else if (valoareCalculata == 1 || valoareCalculata == 0) {
            valoareCalculata = 1;
        } else {
            valoareCalculata = Math.exp(logGamma(valoareCalculata + 1));
        }
    }

    @Override
    public void radical() throws RemoteException {
        valoareCalculata = Math.sqrt(valoareCalculata);
    }

    @Override
    public void initializare(double valoare) throws RemoteException {
        valoareCalculata = valoare;
    }

    @Override
    public void adunare_la_memorie(double valoare) throws RemoteException {
        memorie += valoare;
    }

    @Override
    public void scadere_la_memorie(double valoare) throws RemoteException {
        memorie -= valoare;
    }

    @Override
    public void stergereMemorie(double valoare) throws RemoteException {
        memorie = 0;
    }

    @Override
    public double getMemorie() throws RemoteException {
        return memorie;
    }

    @Override
    public void initializareMemorie(double valoare) throws RemoteException {
        memorie = valoare;
    }
}

public class Server {

    public int readPort(Scanner sc) {

        try {
            int port = sc.nextInt();
            return port;
        } catch (Exception e) {
            System.out.print("Nu ai dat un numar\nPort:");
            return readPort(sc);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Port : ");
        try {
            int port = sc.nextInt();
            Registry registru = LocateRegistry.createRegistry(port);
            Generator calculator = new Generator();
            registru.bind("Calculator", calculator);
            System.out.println("Serverul s-a legat la registrul local RMI prin portul " + port);
        } catch (InputMismatchException e) {
            System.out.println("Nu ai dat un numar");
        } catch (IllegalArgumentException e) {
            System.out.println("Numarul dat e negativ");
        } catch (RemoteException e) {
            System.out.println("Portul dat este ocupat");
        }
    }
}
