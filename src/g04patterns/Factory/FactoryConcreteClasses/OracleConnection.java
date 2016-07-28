package g04patterns.Factory.FactoryConcreteClasses;

import g04patterns.Factory.Connection;

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
