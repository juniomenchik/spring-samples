package estructural.composite;

public class Computador {
    public String nome;
    public Integer ram;
    public Float preco;
    public MarcaEletronicos marcaEletronicos;

    public Computador(String nome, Integer ram, Double preco, MarcaEletronicos marcaEletronicos) {
        this.nome = nome;
        this.ram = ram;
        this.preco = preco.floatValue();
        this.marcaEletronicos = marcaEletronicos;
    }

    //toJsonString
    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                ", ram=" + ram +
                ", preco=" + preco +
                ", marcaEletronicos=" + marcaEletronicos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public MarcaEletronicos getMarcaEletronicos() {
        return marcaEletronicos;
    }

    public void setMarcaEletronicos(MarcaEletronicos marcaEletronicos) {
        this.marcaEletronicos = marcaEletronicos;
    }
}
