package g04patterns.FactoryPatternGoFway.FactorConcreteClasses;

import g04patterns.FactoryPatternGoFway.Connection;

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
