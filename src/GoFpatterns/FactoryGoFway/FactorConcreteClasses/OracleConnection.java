package GoFpatterns.FactoryGoFway.FactorConcreteClasses;

import GoFpatterns.FactoryGoFway.Connection;

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
