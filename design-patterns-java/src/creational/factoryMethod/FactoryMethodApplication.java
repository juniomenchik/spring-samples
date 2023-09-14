package creational.factoryMethod;

import creational.factoryMethod.factories.RandomVeiculoGen;
import creational.factoryMethod.veiculo.Veiculo;

public class FactoryMethodApplication {
    String names[] = {"Ana", "Joana", "Pedro"};
    public static void main(String[] args) {
        Veiculo veiculo = new RandomVeiculoGen().getRandomVeiculo();
        veiculo.pegarCliente("João");
        veiculo.parar();
    }
}
