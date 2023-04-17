package Cliente.ServiceInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterfaceCalculator extends Remote {
    public Double adicionarUmAOutro(Double a, Double b) throws RemoteException;
    public Double subtrairUmDeOutro(Double a, Double b) throws RemoteException;
    public Double multiplicarUmPeloOutro(Double a, Double b) throws RemoteException;
    public Double dividirUmPeloOutro(Double a, Double b) throws RemoteException;
}