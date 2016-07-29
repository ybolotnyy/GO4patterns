package GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses;

import GoFpatterns.Creational.Factory.GoFwayFactory.Connection;

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
