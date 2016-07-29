package GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses;

import GoFpatterns.Creational.Factory.GoFwayFactory.Connection;

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
