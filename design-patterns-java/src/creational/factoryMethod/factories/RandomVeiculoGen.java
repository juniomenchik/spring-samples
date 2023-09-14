package creational.factoryMethod.factories;

import creational.factoryMethod.veiculo.Veiculo;

public class RandomVeiculoGen {
    public Veiculo getRandomVeiculo(){
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            return new BicicletaFactory().getVeiculo("Bicicleta");
        } else {
            return new CarroFactory().getVeiculo("Carro");
        }
    }
}
