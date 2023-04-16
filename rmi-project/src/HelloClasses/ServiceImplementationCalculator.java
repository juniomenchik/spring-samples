package HelloClasses;

import ExternalServices.ColorToRGB;
import ExternalServices.RgbToColor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImplementationCalculator extends UnicastRemoteObject implements MethodsInterfaceCalculator {
    public ServiceImplementationCalculator() throws RemoteException {
        super();
        System.out.println("HelloServant created");
    }
    public Double add(Double a, Double b) throws RemoteException {
        System.out.println("HelloServant received: " + a + " and " + b);
        System.out.println("HelloServant returned: " + (a + b));
        return a + b;
    }
    public Double sub(Double a, Double b) throws RemoteException {
        System.out.println("HelloServant received: " + a + " and " + b);
        System.out.println("HelloServant returned: " + (a - b));
        return a - b;
    }
    public Double mult(Double a, Double b) throws RemoteException {
        System.out.println("HelloServant received: " + a + " and " + b);
        System.out.println("HelloServant returned: " + (a * b));
        return a * b;
    }
    public Double div(Double a, Double b) throws RemoteException {
        System.out.println("HelloServant received: " + a + " and " + b);
        System.out.println("HelloServant returned: " + (a / b));
        return a / b;
    }

}
