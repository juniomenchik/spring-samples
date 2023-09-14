package creational.abstractFactory.factories;

import creational.abstractFactory.interfaces.ElementAbstractFactory;
import creational.abstractFactory.interfaces.ProdA;
import creational.abstractFactory.interfaces.ProdB;
import creational.abstractFactory.model.ProdASolid;
import creational.abstractFactory.model.ProdBSolid;

public class ConcreteFactorySolid implements ElementAbstractFactory {

    @Override
    public ProdA createProdA() {
        return new ProdASolid();
    }

    @Override
    public ProdB createProdB() {
        return new ProdBSolid();
    }

}
