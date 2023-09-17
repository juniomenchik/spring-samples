package estructural.adapter;

public class CpfValidatorAdapter implements CpfValidateProtocol {
    ClientExterno clientExterno = new ClientExterno();
    @Override
    public boolean checkCPFTrustability(String cpf) {
        return clientExterno.checkCPFTrustability(cpf);
    }
}
