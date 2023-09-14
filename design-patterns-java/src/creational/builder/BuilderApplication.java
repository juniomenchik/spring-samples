package creational.builder;

import creational.builder.classes.Arroz;
import creational.builder.classes.Bebida;
import creational.builder.classes.CaixaProduto;
import creational.builder.classes.Carne;
import creational.builder.classes.Feijao;
import creational.builder.classes.MainProdutoBuilder;
import netscape.javascript.JSObject;

public class BuilderApplication {
    public static void main(String[] args) {
//
//        Arroz arroz = new Arroz("Arroz", 10);
//        Feijao feijao = new Feijao("Feijao", 20);
//        Bebida bebida = new Bebida("Bebida", 30);
//        Carne carne = new Carne("Carne", 40);
//
//        CaixaProduto caixaRefeicao = new CaixaProduto();
//        caixaRefeicao.addRefeicao(arroz, feijao, bebida, carne);
//
//        System.out.println("Preço da caixa de produto: " + caixaRefeicao.getPrice());
        
        MainProdutoBuilder mainProdutoBuilder = new MainProdutoBuilder();
        mainProdutoBuilder.makeCarne().makeArroz().makeBebida();
        System.out.println("Preço da caixa de produto: " + mainProdutoBuilder.getPrice());
        System.out.println(mainProdutoBuilder.getCaixaProduto());
        mainProdutoBuilder.reset();
        System.out.println("Preço da caixa de produto: " + mainProdutoBuilder.getPrice());
    }
}