package HelloClasses;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImplementationManipulacaoDeStrings extends UnicastRemoteObject implements MethodsInterfaceManipulacaoDeStrings {
    public ServiceImplementationManipulacaoDeStrings() throws RemoteException {
        super();
    }
    public String concat(String a, String b) throws RemoteException {
        String str = a + b;
        return str;
    }
    public Boolean contains(String a, String b) throws RemoteException {
        return a.contains(b);
    }
    public String remove(String a, String b) throws RemoteException {
        String str = a.contains(b) ? a.replace(b, "") : b;
        return str;
    }
}
