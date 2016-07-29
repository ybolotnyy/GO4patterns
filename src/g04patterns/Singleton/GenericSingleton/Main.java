package g04patterns.Singleton.GenericSingleton;

public class Main {

    public static void main(String[] args) {

        Database database;

        database = Database.createInstance("products");
        System.out.printf("This is the '%s' database \n", database.getName());

        database = Database.createInstance("customers");
        System.out.printf("This is the '%s' database \n", database.getName());
    }
}
