package HelloClasses;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterfaceCalculator extends Remote {

    //implemente todos os metodos de uma calculadora
    //soma, subtracao, multiplicacao, divisao, raiz quadrada, potencia, logaritmo, seno, cosseno, tangente, arco seno, arco cosseno, arco tangente, fatorial, porcentagem, etc
    public Double add(Double a, Double b) throws RemoteException;
    public Double sub(Double a, Double b) throws RemoteException;
    public Double mult(Double a, Double b) throws RemoteException;
    public Double div(Double a, Double b) throws RemoteException;
}
