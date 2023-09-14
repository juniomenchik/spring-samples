package creational.builder.classes;

import creational.builder.interfaces.AbstractProduto;
import creational.builder.interfaces.ProdutoCompositeProtocol;

public class Arroz extends AbstractProduto implements ProdutoCompositeProtocol {

    public Arroz(String nome, Integer preco) {
        super(nome, preco);
    }

    @Override
    public Integer getPrice() {
        return super.getPreco();
    }
}
