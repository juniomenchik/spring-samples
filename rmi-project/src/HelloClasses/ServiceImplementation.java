package HelloClasses;

import ExternalServices.ColorToRGB;
import ExternalServices.RgbToColor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.Date;

public class ServiceImplementation extends UnicastRemoteObject implements MethodsInterface {
    public ServiceImplementation() throws RemoteException {
        super();
        System.out.println("HelloServant created");
    }
    public String sayHello(String input) throws RemoteException {
        String defaultmessage = "From Server: dae rapaz tudo certo? :D";
        System.out.println("HelloServant received: " + input);
        System.out.println("HelloServant returned: " + defaultmessage);
        return defaultmessage;
    }
    public Double add(Double a, Double b) throws RemoteException {
        System.out.println("HelloServant received: " + a + " and " + b);
        System.out.println("HelloServant returned: " + (a + b));
        return a + b;
    }
    public String colorToRgb(String resp) throws RemoteException{
        System.out.println("HelloServant received: " + resp);
        String str = ColorToRGB.colorToRGB(resp);
        System.out.println("ColorToRGB returned: " + str);
        return str;
    }
    public String rgbToColor(String resp) throws RemoteException{
        System.out.println("HelloServant received: " + resp);
        String str = RgbToColor.rgbToColor(resp);
        System.out.println("RgbToColor returned: " + str);
        return str;
    }
}
