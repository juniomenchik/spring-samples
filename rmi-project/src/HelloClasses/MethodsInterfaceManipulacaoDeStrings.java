package HelloClasses;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodsInterfaceManipulacaoDeStrings extends Remote {

    //metodo que concatena duas strings
    public String concat(String a, String b) throws RemoteException;
    //retorna verdadeiro ou falso, se string 1, estiver dentro de string2
    public Boolean contains(String a, String b) throws RemoteException;
    //tera duas strings, se a string2 estiver dentro da string1, remova a string2 da string1, senao retorne string2
    public String remove(String a, String b) throws RemoteException;

}
