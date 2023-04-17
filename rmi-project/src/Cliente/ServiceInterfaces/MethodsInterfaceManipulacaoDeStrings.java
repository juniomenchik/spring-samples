package Cliente.ServiceInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterfaceManipulacaoDeStrings extends Remote {
    public String concatenacaoDeDuasStrings(String a, String b) throws RemoteException;
    public Boolean containsStringAemB(String a, String b) throws RemoteException;
    public String removeStringAFromBorReturnB(String a, String b) throws RemoteException;
}