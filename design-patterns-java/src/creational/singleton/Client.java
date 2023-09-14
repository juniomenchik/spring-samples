package creational.singleton;

public class Client {
    private Integer id;
    private String name;
    private String email;

    public Client(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

    public int getId() {
        return id;
    }
}
