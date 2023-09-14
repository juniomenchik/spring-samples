package creational.prototype;

public class Pessoa extends Prototype{
    public Pessoa() {
    }
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.idade = pessoa.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public Prototype clone() {
        return new Pessoa(this);
//        return this;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
