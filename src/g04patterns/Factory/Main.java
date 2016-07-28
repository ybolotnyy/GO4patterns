package g04patterns.Factory;

/**
 * Created by byn on 7/21/16.
 */
public class Main {

    public static void main(String[] args)
    {
        FirstFactory factory;
        Connection connection;

        factory = new FirstFactory("SQL Server");
        connection = factory.createConnection();
        System.out.println("You're connecting with " + connection.description());

        factory = new FirstFactory("Oracle");
        connection = factory.createConnection();
        System.out.println("You're connecting with " + connection.description());

        factory = new FirstFactory("");
        connection = factory.createConnection();
        System.out.println("You're connecting with " + connection.description());
    }
}
