package Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import Cliente.ServiceInterfaces.MethodsInterface;
import Cliente.ServiceInterfaces.MethodsInterfaceBoringChat;
import Cliente.ServiceInterfaces.MethodsInterfaceCalculator;
import Cliente.ServiceInterfaces.MethodsInterfaceManipulacaoDeStrings;

public class ServiceApps {

    MethodsInterface service;
    MethodsInterfaceCalculator serviceCalculator;
    MethodsInterfaceManipulacaoDeStrings serviceStringManipulator;
    MethodsInterfaceBoringChat serviceBoringChat;
    public ServiceApps() throws MalformedURLException, NotBoundException, RemoteException {
         this.service = (MethodsInterface) Naming.lookup("rmi://localhost:1099/service");
         this.serviceCalculator = (MethodsInterfaceCalculator) Naming.lookup("rmi://localhost:1099/calculator");
         this.serviceStringManipulator = (MethodsInterfaceManipulacaoDeStrings) Naming.lookup("rmi://localhost:1099/string_manipulator");
         this.serviceBoringChat = (MethodsInterfaceBoringChat) Naming.lookup("rmi://localhost:1099/chat");
    }

    public MethodsInterface getService() {
        return service;
    }

    public MethodsInterfaceCalculator getServiceCalculator() {
        return serviceCalculator;
    }

    public MethodsInterfaceManipulacaoDeStrings getServiceStringManipulator() {
        return serviceStringManipulator;
    }

    public MethodsInterfaceBoringChat getServiceBoringChat() {
        return serviceBoringChat;
    }
}
