package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance;
    private static int version = 0;
    private List<Client> clients;

    private Database() {
        clients = new ArrayList<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            version++;
            instance = new Database();
        }
        return instance;
    }

    public static int getVersion() {
        return version;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client getClient(int id) {
        return clients.stream().filter(client -> client.getId() == id).findFirst().orElse(null);
    }

    public void deleteClient(int id) {
        clients.removeIf(client -> client.getId() == id);
    }

    public void showClients() {
        clients.forEach(System.out::println);
    }
}
