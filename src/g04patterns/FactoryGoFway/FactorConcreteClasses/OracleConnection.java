package g04patterns.FactoryGoFway.FactorConcreteClasses;

import g04patterns.FactoryGoFway.Connection;

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
