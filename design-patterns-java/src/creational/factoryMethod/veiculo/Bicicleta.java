package creational.factoryMethod.veiculo;

public class Bicicleta implements Veiculo {
    private String nome;
    public Bicicleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void pegarCliente(String customerName) {
        System.out.println(this.nome + " está pegando o cliente " + customerName +".");
    }

    @Override
    public void parar() {
        System.out.println(this.nome + " parou.");
    }
}
