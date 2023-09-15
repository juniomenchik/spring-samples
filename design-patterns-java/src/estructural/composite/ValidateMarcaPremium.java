package estructural.composite;

public class ValidateMarcaPremium extends ValidationComponent {

    @Override
    public boolean validate(Computador computador) {
        if (    computador.getMarcaEletronicos().equals(MarcaEletronicos.LENOVO) ||
                computador.getMarcaEletronicos().equals(MarcaEletronicos.AVELL) ||
                computador.getMarcaEletronicos().equals(MarcaEletronicos.DELL)) {

            System.out.println("Validating premium brand: " + computador.getMarcaEletronicos().toString());
            return true;
        } else {
            System.out.println("Computador : "+ computador);
            System.out.println("Invalid premium brand: " + computador.getMarcaEletronicos().toString());
            return false;
        }
    }
}
