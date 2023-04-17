package Cliente;

import java.rmi.RemoteException;
import java.util.Scanner;
import Cliente.ServiceApps;

public class OrganizeService {

    public void conversorColorRGB(ServiceApps serviceApps) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Color to RGB");
        System.out.println("2 - RGB to Color");
        System.out.println("0 - Voltar");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1" -> {
                System.out.println("Opcao Selecionada: 3 - Cor em String Para Valor RGB");
                System.out.println("Exemplos: red, green, blue, yellow, black, white, purple, orange, gray, brown");
                String resp = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : " + serviceApps.getService().colorToRgb(resp));
            }
            case "2" -> {
                System.out.println("Opcao Selecionada: 4 - Valor RGB para Cor em String");
                System.out.println("Exemplos: 255 0 0, 0 255 0, 0 0 255, 255 255 0, 255 0 255, 0 255 255, 255 255 255, 0 0 0");
                String resp = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : " + serviceApps.getService().rgbToColor(resp));
            }
            case "0" -> System.out.println("Voltando");
            default -> System.out.println("Opcao invalida");
        }
    }

    public void calculadora(ServiceApps serviceApps) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Adicionar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Voltar");
        String choose = scanner.nextLine();
        switch (choose){
            case "1" -> {
                System.out.println("Opcao Selecionada: 1 - Adicionar");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceCalculator().adicionarUmAOutro(Double.parseDouble(resp1), Double.parseDouble(resp2)));
            }
            case "2" -> {
                System.out.println("Opcao Selecionada: 2 - Subtrair");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceCalculator().subtrairUmDeOutro(Double.parseDouble(resp1), Double.parseDouble(resp2)));
            }
            case "3" -> {
                System.out.println("Opcao Selecionada: 3 - Multiplicar");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceCalculator().multiplicarUmPeloOutro(Double.parseDouble(resp1), Double.parseDouble(resp2)));
            }
            case "4" -> {
                System.out.println("Opcao Selecionada: 4 - Dividir");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceCalculator().dividirUmPeloOutro(Double.parseDouble(resp1), Double.parseDouble(resp2)));
            }
            case "0" -> System.out.println("Voltando");
            default -> System.out.println("Opcao invalida");
        }
    }

    public void manipulacaoDeStrings(ServiceApps serviceApps) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Concatena Strings");
        System.out.println("2 - String A existe em String B");
        System.out.println("3 - Remove String A de String B");
        System.out.println("0 - Voltar");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1" -> {
                System.out.println("Opcao Selecionada: 1 - Concatena Strings");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceStringManipulator().concatenacaoDeDuasStrings(resp1, resp2));
            }
            case "2" -> {
                System.out.println("Opcao Selecionada: 2 - String A existe em String B");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceStringManipulator().containsStringAemB(resp1, resp2));
            }
            case "3" -> {
                System.out.println("Opcao Selecionada: 3 - Remove String A de String B");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+serviceApps.getServiceStringManipulator().removeStringAFromBorReturnB(resp1, resp2));
            }
            case "0" -> System.out.println("Voltando");
            default -> System.out.println("Opcao invalida");
        }
    }

    public void chatSimples(ServiceApps serviceApps) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Mandar mensagem ao Servidor");
        System.out.println("0 - Voltar");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1" -> {
                System.out.println("Opcao Selecionada: 1, Digite a mensagem que gostaria de enviar ao Servidor");
                String resp1 = scanner.nextLine();
                System.out.println("Server MANUAL Response: " + serviceApps.getServiceBoringChat().sendMsg(resp1));
            }
        }
    }
}
