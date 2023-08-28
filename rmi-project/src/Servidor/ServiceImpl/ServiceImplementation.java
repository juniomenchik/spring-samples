package Servidor.ServiceImpl;

import Servidor.ServiceImpl.ExternalServices.ColorToRGB;
import Servidor.ServiceImpl.ExternalServices.RgbToColor;
import Cliente.ServiceInterfaces.MethodsInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImplementation extends UnicastRemoteObject implements MethodsInterface {
    public ServiceImplementation() throws RemoteException {
        super();
        System.out.println("ServiceImplementation created");
    }
    public String sayHello(String input) throws RemoteException {
        String defaultmessage = "From Server: dae rapaz tudo certo? :D";
        System.out.println("ServiceImplementation received: " + input);
        System.out.println("ServiceImplementation returned: " + defaultmessage);
        return defaultmessage;
    }
    public String colorToRgb(String resp) throws RemoteException{
        System.out.println("ServiceImplementation received: " + resp);
        String str = ColorToRGB.colorToRGB(resp);
        System.out.println("ColorToRGB returned: " + str);
        return str;
    }
    public String rgbToColor(String resp) throws RemoteException{
        System.out.println("ServiceImplementation received: " + resp);
        String str = RgbToColor.rgbToColor(resp);
        System.out.println("RgbToColor returned: " + str);
        return str;
    }
}