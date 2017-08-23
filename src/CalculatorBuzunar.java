
/**
 *
 * @author Dumitru Cristian
 */
import java.rmi.*;

public interface CalculatorBuzunar extends Remote {

    double valoareCurenta() throws RemoteException;

    void adunare(double valoare) throws RemoteException;

    void scadere(double valoare) throws RemoteException;

    void inmultire(double valoare) throws RemoteException;

    void impartire(double valoare) throws RemoteException;

    void inversare() throws RemoteException;

    void putere(double valoare) throws RemoteException;

    void factorial() throws RemoteException;

    void radical() throws RemoteException;

    void initializare(double valoare) throws RemoteException;

    void adunare_la_memorie(double valoare) throws RemoteException;

    void scadere_la_memorie(double valoare) throws RemoteException;

    void stergereMemorie(double valoare) throws RemoteException;

    double getMemorie() throws RemoteException;

    void initializareMemorie(double valoare) throws RemoteException;
}

interface CalculatorBuzunar_Generator extends Remote {

    CalculatorBuzunar server_propriu() throws Exception;
}
