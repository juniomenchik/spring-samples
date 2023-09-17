package estructural.adapter;

public class AdapterApplication {
    public static void main(String[] args) {
        CpfValidateProtocol cpfValidator = new CpfValidatorAdapter();
        System.out.println(cpfValidator.checkCPFTrustability("12345678900"));
    }
}
