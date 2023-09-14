package creational.builder.classes;

import java.util.ArrayList;
import java.util.Arrays;

import creational.builder.interfaces.ProdutoCompositeProtocol;

public class CaixaProduto implements ProdutoCompositeProtocol {

    private ArrayList<ProdutoCompositeProtocol> refeicoes = new ArrayList<ProdutoCompositeProtocol>();

    public void addRefeicao(ProdutoCompositeProtocol... produtoCompositeProtocols){
        this.refeicoes.addAll(Arrays.asList(produtoCompositeProtocols));
    }

    @Override
    public Integer getPrice() {
        return refeicoes.stream()
                .mapToInt(ProdutoCompositeProtocol::getPrice)
                .sum();
    }
}
