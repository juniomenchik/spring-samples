package HelloClasses;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.Date;

public interface MethodsInterface extends Remote {
    public String sayHello(String input) throws RemoteException;
    public String colorToRgb(String resp) throws RemoteException;
    public String rgbToColor(String resp) throws RemoteException;
}