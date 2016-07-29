package GoFpatterns.FactoryGoFway.FactorConcreteClasses;

import GoFpatterns.FactoryGoFway.Connection;

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
