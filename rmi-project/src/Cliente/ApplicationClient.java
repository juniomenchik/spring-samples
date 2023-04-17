package Cliente;



import HelloClasses.MethodsInterfaceCalculator;
import HelloClasses.MethodsInterfaceManipulacaoDeStrings;
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
       ServiceApps serviceApps = new ServiceApps();
       Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("Selecione uma opcao: ");
           System.out.println("1 - Hello");

           System.out.println("2 - Servico conversor Color/RGB");
           System.out.println("3 - Servico Calculadora");
           System.out.println("4 - Servico Manipulacao de Strings");
           System.out.println("0 - Sair");
           String choose = scanner.nextLine();

           switch (choose){
               case "1" -> {
                   System.out.println("Opcao Selecionada: 1 - Digite Olá para o servidor");
                   String resp = scanner.nextLine();
                   System.out.println("Resposta vinda do servidor : "+serviceApps.getService().sayHello(resp));
               }
               case "2" -> {
                   System.out.println("Opcao Selecionada: 2 - Servico conversor Color/RGB");
                   organizeService.conversorColorRGB(serviceApps);
               }
               case "3" -> {
                     System.out.println("Opcao Selecionada: 3 - Servico Calculadora");
                     organizeService.calculadora(serviceApps);
               }
               case "4" -> {
                   System.out.println("Opcao Selecionada: 4 - Manipulacao de Strings");
                   organizeService.manipulacaoDeStrings(serviceApps);
               }
               case "0" -> System.exit(0);
               default -> System.out.println("Opcao invalida");
           }

       }
    }
}