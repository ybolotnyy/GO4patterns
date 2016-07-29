package GoFpatterns.FactoryGoFway;

/**
 * Created by byn on 7/21/16.
 */
public class Main {

    public static void main(String[] args)
    {
        Connection connection;
        ConcreteFactory factory;

        factory = new ConcreteFactory();

        connection = factory.createConnection("Oracle");
        System.out.println("You're connecting using " + connection.description());

        connection = factory.createConnection("SQL Server");
        System.out.println("You're connecting using " + connection.description());

        connection = factory.createConnection("");
        System.out.println("You're connecting using " + connection.description());
    }
}
