package creational.builder.classes;

import creational.builder.interfaces.ProdutoBuilderProtocol;
import netscape.javascript.JSObject;

public class MainProdutoBuilder implements ProdutoBuilderProtocol{

    private CaixaProduto caixaProduto = new CaixaProduto();

    public MainProdutoBuilder reset() {
        caixaProduto = new CaixaProduto();
        return this;
    }

    @Override
    public ProdutoBuilderProtocol makeArroz() {
        Arroz arroz = new Arroz("Arroz", 10);
        Bebida bebida = new Bebida("Bebida", 5);
        Carne carne = new Carne("Carne", 15);
        caixaProduto.addRefeicao(arroz, bebida, carne);
        return this;
    }

    @Override
    public ProdutoBuilderProtocol makeCarne() {
        Carne carne = new Carne("Picanha", 30);
        Bebida bebida = new Bebida("Bebida", 5);
        caixaProduto.addRefeicao(carne, bebida);
        return this;
    }

    @Override
    public ProdutoBuilderProtocol makeBebida() {
        Bebida bebida = new Bebida("Bebida", 5);
        caixaProduto.addRefeicao(bebida);
        return this;
    }

    public CaixaProduto getCaixaProduto() {
        return caixaProduto;
    }

    public Integer getPrice(){
        return caixaProduto.getPrice();
    }

}
