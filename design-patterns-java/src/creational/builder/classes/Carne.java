package creational.builder.classes;

import creational.builder.interfaces.AbstractProduto;
import creational.builder.interfaces.ProdutoCompositeProtocol;

public class Carne extends AbstractProduto implements ProdutoCompositeProtocol {

    public Carne(String nome, Integer preco) {
        super(nome, preco);
    }

    @Override
    public Integer getPrice() {
        return super.getPreco();
    }
}
