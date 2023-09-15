package estructural.composite;

public class ValidationComposite extends ValidationComponent {
    private ValidationComponent[] components;

    public ValidationComposite(ValidationComponent... components) {
        this.components = components;
    }

    @Override
    public boolean validate(Computador computador) {
        for (ValidationComponent component : components) {
            if (!component.validate(computador)) return false;
        }
        return true;
    }
}
