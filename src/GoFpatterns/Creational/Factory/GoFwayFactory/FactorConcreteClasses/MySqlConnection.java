package GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses;


import GoFpatterns.Creational.Factory.GoFwayFactory.Connection;

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
