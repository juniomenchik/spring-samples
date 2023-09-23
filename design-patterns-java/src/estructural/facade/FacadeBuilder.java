package estructural.facade;

import creational.builder.classes.MainProdutoBuilder;
import creational.builder.interfaces.ProdutoBuilderProtocol;

public class FacadeBuilder {
    MainProdutoBuilder mainProdutoBuilder;
    public MainProdutoBuilder makeCompleteMeal(){
        mainProdutoBuilder = new MainProdutoBuilder();
        mainProdutoBuilder.makeArroz().makeCarne().makeBebida();
        return mainProdutoBuilder;
    }
    public MainProdutoBuilder makeDrinks(){
        mainProdutoBuilder = new MainProdutoBuilder();
        mainProdutoBuilder.makeBebida().makeBebida();
        return mainProdutoBuilder;
    }
    public MainProdutoBuilder makeRice(){
        mainProdutoBuilder = new MainProdutoBuilder();
        mainProdutoBuilder.makeArroz().makeArroz();
        return mainProdutoBuilder;
    }

}
