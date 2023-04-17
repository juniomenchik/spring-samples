package Servidor.ServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import Cliente.ServiceInterfaces.MethodsInterfaceBoringChat;

public class ServiceImplementationBoringChat extends UnicastRemoteObject implements MethodsInterfaceBoringChat {
    public ServiceImplementationBoringChat() throws RemoteException {
        super();
        System.out.println("ServiceImplementationBoringChat created");
    }
    public String sendMsg(String msg) throws RemoteException {
        System.out.println("ServiceImplementationBoringChat received: " + msg);
        System.out.println("Por favor servidor, responda essa requisicao aqui :");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("ServiceImplementationBoringChat returned: " + str);
        return str;
    }

}
