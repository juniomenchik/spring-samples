package creational.factoryMethod.factories;

import creational.factoryMethod.veiculo.Bicicleta;
import creational.factoryMethod.veiculo.Veiculo;

public class BicicletaFactory extends VeiculoFactory {
    @Override
    public Veiculo getVeiculo(String veiculoName) {
        return new Bicicleta(veiculoName);
    }

}
