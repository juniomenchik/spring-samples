package creational.prototype;

public class PrototypeApplication {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Menchique", 23);
        Pessoa protoPessoa = new Pessoa();

        Pessoa clone = (Pessoa) pessoa.clone();
        Pessoa protoClone = (Pessoa) protoPessoa.clone();


        System.out.println(clone);
        System.out.println(protoClone);

        pessoa.nome = "Maria";

        System.out.println(clone);
        System.out.println(protoClone);
    }
}
