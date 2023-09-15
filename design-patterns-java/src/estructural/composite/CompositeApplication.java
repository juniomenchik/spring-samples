package estructural.composite;

public class CompositeApplication {
    public static void main(String[] args) {
        ValidationComponent validation = new ValidationComposite(
                new ValidateRam16(),
                new ValidateMarcaPremium(),
                new ValidatePrecoAlto()
        );

        Computador pc = new Computador("Dell Latitude 1045", 8, 5000.00, MarcaEletronicos.DELL);
        validation.validate(pc);
        Computador pc0 = new Computador("Avell G1513", 16, 20000.00, MarcaEletronicos.AVELL);
        validation.validate(pc0);
        Computador pc1 = new Computador("Lenovo",32, 10000.00, MarcaEletronicos.LENOVO);
        validation.validate(pc1);
        Computador pc2 = new Computador("Asus", 8, 1000.00, MarcaEletronicos.ASUS);
        validation.validate(pc2);

    }
}
