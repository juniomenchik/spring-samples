package estructural.facade;

import creational.builder.interfaces.ProdutoBuilderProtocol;

public class FacadeApplication {
    public static void main(String[] args) {
        FacadeBuilder facadeBuilder = new FacadeBuilder();
        System.out.println(facadeBuilder.makeCompleteMeal().getPrice());
        System.out.println(facadeBuilder.makeDrinks().getPrice());
        System.out.println(facadeBuilder.makeRice().getPrice());
    }
}
