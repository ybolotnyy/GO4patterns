package GoFpatterns.FactoryGoFway.FactorConcreteClasses;


import GoFpatterns.FactoryGoFway.Connection;

public class MySqlConnection extends Connection
{
    public MySqlConnection()
    {

    }

    public String description()
    {
        return "MySQL connection";
    }
}
