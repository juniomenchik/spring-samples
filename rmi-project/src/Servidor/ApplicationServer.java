package Servidor;

import Servidor.ServiceImpl.ServiceImplementation;
import Servidor.ServiceImpl.ServiceImplementationBoringChat;
import Servidor.ServiceImpl.ServiceImplementationCalculator;
import Servidor.ServiceImpl.ServiceImplementationManipulacaoDeStrings;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer {
    public static void main(String[] args) throws RemoteException {
      Registry registry =  LocateRegistry.createRegistry(1099);
      registry.rebind("service", new ServiceImplementation());
      registry.rebind("calculator", new ServiceImplementationCalculator());
      registry.rebind("string_manipulator", new ServiceImplementationManipulacaoDeStrings());
      registry.rebind("chat",new ServiceImplementationBoringChat());
    }
}