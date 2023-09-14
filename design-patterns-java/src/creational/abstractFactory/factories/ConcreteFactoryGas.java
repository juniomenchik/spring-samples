package creational.abstractFactory.factories;

import creational.abstractFactory.interfaces.ElementAbstractFactory;
import creational.abstractFactory.interfaces.ProdA;
import creational.abstractFactory.interfaces.ProdB;
import creational.abstractFactory.model.ProdAGas;
import creational.abstractFactory.model.ProdBGas;

public class ConcreteFactoryGas implements ElementAbstractFactory {
    @Override
    public ProdA createProdA() {
        return new ProdAGas();
    }

    @Override
    public ProdB createProdB() {
        return new ProdBGas();
    }
}
