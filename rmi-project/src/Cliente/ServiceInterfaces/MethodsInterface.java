package Cliente.ServiceInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterface extends Remote {
    public String sayHello(String input) throws RemoteException;
    public String colorToRgb(String resp) throws RemoteException;
    public String rgbToColor(String resp) throws RemoteException;
}