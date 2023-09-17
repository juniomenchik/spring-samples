package estructural.adapter;

public class ClientExterno {
    public boolean checkCPFTrustability(String cpf) {
        System.out.println("Verificando CPF " + cpf + " na base de dados externa...");
        return true;
    }
}
