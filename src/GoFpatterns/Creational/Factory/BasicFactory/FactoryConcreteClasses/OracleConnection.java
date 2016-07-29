package GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses;

import GoFpatterns.Creational.Factory.BasicFactory.Connection;

public class OracleConnection extends Connection
{
    public OracleConnection()
    {

    }

    public String description()
    {
        return "Oracle";
    }
}
