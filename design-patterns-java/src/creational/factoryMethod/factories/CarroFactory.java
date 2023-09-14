package creational.factoryMethod.factories;

import creational.factoryMethod.veiculo.Carro;
import creational.factoryMethod.veiculo.Veiculo;

public class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo getVeiculo(String veiculoName) {
        return new Carro(veiculoName);
    }

}
