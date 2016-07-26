package g04patterns.FactoryPatternGoFway.FactorConcreteClasses;


import g04patterns.FactoryPatternGoFway.Connection;

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
