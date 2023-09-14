package creational.factoryMethod.factories;

import creational.factoryMethod.veiculo.Veiculo;

public abstract class VeiculoFactory {
    // Factory Method
    public abstract Veiculo getVeiculo(String veiculoName);

    public Veiculo pegarCliente(String veiculoName, String clienteName) {
        Veiculo veiculo = getVeiculo(veiculoName);
        veiculo.pegarCliente(clienteName);
        return veiculo;
    }
}
