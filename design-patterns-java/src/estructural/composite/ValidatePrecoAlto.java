package estructural.composite;

public class ValidatePrecoAlto extends ValidationComponent {

    @Override
    public boolean validate(Computador computador) {
        if (computador.getPreco() < 15000.00) {
            System.out.println("Validating preco: " + computador.getPreco());
            return true;
        } else {
            System.out.println("Computador : "+ computador);
            System.out.println("Invalid preco: " + computador.getPreco());
            return false;
        }
    }
}
