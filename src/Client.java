
/**
 *
 * @author Dumitru Cristian
 */
import java.rmi.*;

class Client {

    private final String adresa;
    private final int port;
    private CalculatorBuzunar_Generator ob;
    private CalculatorBuzunar server;
    private final Calculator gui;

    Client(String adresa, int port, Calculator gui) {

        this.adresa = adresa;
        this.port = port;
        this.gui = gui;
        String url = "rmi://" + adresa + ":" + port + "/Calculator";
        try {
            ob = (CalculatorBuzunar_Generator) Naming.lookup(url);
            server = ob.server_propriu();
        } catch (Exception e) {
            gui.eroareServer("Conectare esuata");
        }
    }

    public void deconectare() {

        ob = null;
        server = null;
    }

    public void operatie(int operator, double numar) {

        try {
            switch (operator) {

                case 1:
                    server.adunare(numar);
                    break;
                case 2:
                    server.scadere(numar);
                    break;
                case 3:
                    if (numar == 0 && server.valoareCurenta() == Double.POSITIVE_INFINITY) {
                        gui.eroare("Eroare - Infinit ori 0");
                    } else {
                        server.inmultire(numar);
                    }
                    break;
                case 4:
                    if (numar != 0) {
                        server.impartire(numar);
                    } else {
                        gui.eroare("Eroare - Impartire la 0");
                    }
                    break;
                case 5:
                    server.initializare(numar);
                    if (numar != 0) {
                        server.inversare();
                    } else {
                        gui.eroare("Eroare - Inversul lui 0");
                    }
                    break;
                case 6:
                    if (numar == 0 && server.valoareCurenta() == 0) {
                        gui.eroare("Eroare - 0 la puterea 0");
                    } else if (numar == 0 && server.valoareCurenta() == Double.POSITIVE_INFINITY) {
                        gui.eroare("Eroare - infinit la puterea 0");
                    } else {
                        server.putere(numar);
                    }
                    break;
                case 7:
                    server.initializare(numar);
                    if (numar >= 0 && numar != Double.POSITIVE_INFINITY) {
                        server.factorial();
                    } else if (numar == Double.POSITIVE_INFINITY) {
                        gui.eroare("Eroare - Factorial din infinit");
                    } else {
                        gui.eroare("Eroare - Factorial din numar negativ");
                    }
                    break;
                case 8:
                    server.initializare(numar);
                    if (numar >= 0 && numar != Double.POSITIVE_INFINITY) {
                        server.radical();
                    } else if (numar == Double.POSITIVE_INFINITY) {
                        gui.eroare("Eroare - Radical din infinit");
                    } else {
                        gui.eroare("Eroare - Radical din numar negativ");
                    }
                    break;
                case 9:
                    server.initializare(numar);
                    break;
                case 10:
                    server.initializareMemorie(numar);
                    break;
                case 11:
                    server.initializareMemorie(0);
                    break;
                case 12:
                    server.scadere_la_memorie(numar);
                    break;
                case 13:
                    server.adunare_la_memorie(numar);
            }
        } catch (RemoteException e) {
            gui.eroareServer("Serverul este offline");
        }
    }

    public double getCurentValue() throws RemoteException {
        return server.valoareCurenta();
    }

    public double getMemoryvalue() throws RemoteException {
        return server.getMemorie();
    }
}
