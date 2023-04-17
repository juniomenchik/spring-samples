package Servidor.ServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Cliente.ServiceInterfaces.MethodsInterfaceManipulacaoDeStrings;

public class ServiceImplementationManipulacaoDeStrings extends UnicastRemoteObject implements MethodsInterfaceManipulacaoDeStrings {
    public ServiceImplementationManipulacaoDeStrings() throws RemoteException {
        super();
        System.out.println("ServiceImplementationManipulacaoDeStrings created");
    }
    public String concatenacaoDeDuasStrings(String a, String b) throws RemoteException {
        System.out.println("ServiceImplementationManipulacaoDeStrings received: " + a + " and " + b);
        String str = a + b;
        System.out.println("ServiceImplementationManipulacaoDeStrings returned: " + str);
        return str;
    }
    public Boolean containsStringAemB(String a, String b) throws RemoteException {
        System.out.println("ServiceImplementationManipulacaoDeStrings received: " + a + " and " + b);
        System.out.println("ServiceImplementationManipulacaoDeStrings returned: " + a.contains(b));
        return a.contains(b);
    }
    public String removeStringAFromBorReturnB(String a, String b) throws RemoteException {
        System.out.println("ServiceImplementationManipulacaoDeStrings received: " + a + " and " + b);
        String str = a.contains(b) ? a.replace(b, "") : b;
        System.out.println("ServiceImplementationManipulacaoDeStrings returned: " + str);
        return str;
    }
}
