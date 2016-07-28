package g04patterns.Factory.FactoryConcreteClasses;

import g04patterns.Factory.Connection;

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
