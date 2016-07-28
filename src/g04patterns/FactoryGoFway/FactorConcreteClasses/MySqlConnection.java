package g04patterns.FactoryGoFway.FactorConcreteClasses;


import g04patterns.FactoryGoFway.Connection;

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
