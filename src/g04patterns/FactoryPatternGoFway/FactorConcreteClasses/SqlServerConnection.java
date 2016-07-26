package g04patterns.FactoryPatternGoFway.FactorConcreteClasses;

import g04patterns.FactoryPatternGoFway.Connection;

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
