package g04patterns.FactoryPattern.FactoryConcreteClasses;

import g04patterns.FactoryPattern.Connection;

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
