package estructural.composite;

public class ValidateRam16 extends ValidationComponent {

    @Override
    public boolean validate(Computador computador) {
        if (computador.getRam() >= 16) {
            System.out.println("Validating ram: " + computador.getRam());
            return true;
        } else {
            System.out.println("Computador : "+ computador);
            System.out.println("Invalid ram: " + computador.getRam());
            return false;
        }
    }
}
