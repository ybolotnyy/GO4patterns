package GoFpatterns.Factory.FactoryConcreteClasses;

import GoFpatterns.Factory.Connection;

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
