package Cliente;



import HelloClasses.OrganizeService;
import HelloClasses.MethodsInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ApplicationClient {

    static OrganizeService organizeService = new OrganizeService();
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
       MethodsInterface service = (MethodsInterface) Naming.lookup("rmi://localhost:1099/service");
       Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("Selecione uma opcao: ");
           System.out.println("1 - Hello");
           System.out.println("2 - Add");
           System.out.println("3 - Color to RGB");
           System.out.println("4 - RGB to Color");

           String choose = scanner.nextLine();
           organizeService.choose(choose,service);
       }
    }
}