package GoFpatterns.Factory.FactoryConcreteClasses;

import GoFpatterns.Factory.Connection;

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
