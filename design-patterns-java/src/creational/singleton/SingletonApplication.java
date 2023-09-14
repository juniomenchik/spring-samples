package creational.singleton;

public class SingletonApplication {
    public static void main(String[] args) {

        System.out.println("SingletonApplication Pattern Demo");
        System.out.println("Database version: " + Database.getVersion());
        Database database = Database.getInstance();
        database.addClient(new Client(1, "John", "john@email.com"));
        database.addClient(new Client(2, "Mary", "mary@email.com"));
        database.showClients();
        System.out.println("Database version: " + Database.getVersion());
        Database anotherDatabase = Database.getInstance();
        anotherDatabase.showClients();
        System.out.println("Database version: " + Database.getVersion());

    }
}