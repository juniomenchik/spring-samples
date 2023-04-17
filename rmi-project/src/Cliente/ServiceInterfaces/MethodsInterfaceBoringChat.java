package Cliente.ServiceInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterfaceBoringChat extends Remote {

    //chat
    public String sendMsg(String msg) throws RemoteException;
}