package g04patterns.FactoryGoFway.FactorConcreteClasses;

import g04patterns.FactoryGoFway.Connection;

public class SqlServerConnection extends Connection
{
    public SqlServerConnection()
    {

    }

    public String description()
    {
        return "SqlServerConnection";
    }
}
