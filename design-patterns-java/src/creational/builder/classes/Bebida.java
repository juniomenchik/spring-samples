package creational.builder.classes;

import creational.builder.interfaces.AbstractProduto;
import creational.builder.interfaces.ProdutoCompositeProtocol;

public class Bebida extends AbstractProduto implements ProdutoCompositeProtocol {

    public Bebida(String nome, Integer preco) {
        super(nome, preco);
    }

    @Override
    public Integer getPrice() {
        return super.getPreco();
    }
}
