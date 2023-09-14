package creational.abstractFactory;

import creational.abstractFactory.factories.ConcreteFactoryGas;
import creational.abstractFactory.factories.ConcreteFactorySolid;
import creational.abstractFactory.model.ProdAGas;
import creational.abstractFactory.model.ProdASolid;
import creational.abstractFactory.model.ProdBGas;
import creational.abstractFactory.model.ProdBSolid;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Application");

        ConcreteFactoryGas concreteFactoryGas = new ConcreteFactoryGas();
        ConcreteFactorySolid concreteFactorySolid = new ConcreteFactorySolid();

        ProdASolid prodASolid = (ProdASolid) concreteFactorySolid.createProdA();
        ProdBSolid prodBSolid = (ProdBSolid) concreteFactorySolid.createProdB();

        ProdAGas prodAGas = (ProdAGas) concreteFactoryGas.createProdA();
        ProdBGas prodBGas = (ProdBGas) concreteFactoryGas.createProdB();
    }

}
