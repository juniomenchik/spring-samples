package HelloClasses;

import java.rmi.RemoteException;
import java.util.Scanner;

public class OrganizeService {
    public void choose(String choose, MethodsInterface service) throws RemoteException {
        Scanner scanner = new Scanner(System.in);
        switch (choose) {
            case "1" -> {
                System.out.println("Opcao Selecionada: 1 - Digite Olá para o servidor");
                String resp = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+service.sayHello(resp));
            }
            case "2" -> {
                System.out.println("Opcao Selecionada: 2 - Soma de Dois numeros");
                String resp1 = scanner.nextLine();
                String resp2 = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+service.add(Double.parseDouble(resp1), Double.parseDouble(resp2)));
            }
            case "3" -> {
                System.out.println("Opcao Selecionada: 3 - Cor em String Para Valor RGB");
                System.out.println("Exemplos: red, green, blue, yellow, black, white, purple, orange, gray, brown");
                String resp = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+service.colorToRgb(resp));
            }
            case "4" -> {
                System.out.println("Opcao Selecionada: 4 - Valor RGB para Cor em String");
                System.out.println("Exemplos: 255 0 0, 0 255 0, 0 0 255, 255 255 0, 255 0 255, 0 255 255, 255 255 255, 0 0 0");
                String resp = scanner.nextLine();
                System.out.println("Resposta vinda do servidor : "+service.rgbToColor(resp));
            }
            default -> System.out.println("Opcao invalida");
        }
    }
}
