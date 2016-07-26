package g04patterns.FactoryPattern.FactoryConcreteClasses;

import g04patterns.FactoryPattern.Connection;

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
