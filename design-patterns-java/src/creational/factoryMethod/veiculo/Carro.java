package creational.factoryMethod.veiculo;

public class Carro implements Veiculo {
    private String nome;
    public Carro(String nome) {
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
    public void abrirPorta() {
        System.out.println(this.nome + " abriu a porta.");
    }
}
