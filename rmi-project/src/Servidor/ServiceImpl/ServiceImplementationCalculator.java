package Servidor.ServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Cliente.ServiceInterfaces.MethodsInterfaceCalculator;

public class ServiceImplementationCalculator extends UnicastRemoteObject implements MethodsInterfaceCalculator {
    public ServiceImplementationCalculator() throws RemoteException {
        super();
        System.out.println("ServiceImplementationCalculator created");
    }
    public Double adicionarUmAOutro(Double a, Double b) throws RemoteException {
        System.out.println("ServiceImplementationCalculator received: " + a + " and " + b);
        System.out.println("ServiceImplementationCalculator returned: " + (a + b));
        return a + b;
    }
    public Double subtrairUmDeOutro(Double a, Double b) throws RemoteException {
        System.out.println("ServiceImplementationCalculator received: " + a + " and " + b);
        System.out.println("ServiceImplementationCalculator returned: " + (a - b));
        return a - b;
    }
    public Double multiplicarUmPeloOutro(Double a, Double b) throws RemoteException {
        System.out.println("ServiceImplementationCalculator received: " + a + " and " + b);
        System.out.println("ServiceImplementationCalculator returned: " + (a * b));
        return a * b;
    }
    public Double dividirUmPeloOutro(Double a, Double b) throws RemoteException {
        System.out.println("ServiceImplementationCalculator received: " + a + " and " + b);
        System.out.println("ServiceImplementationCalculator returned: " + (a / b));
        return a / b;
    }

}
