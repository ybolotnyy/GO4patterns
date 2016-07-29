package GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses;

import GoFpatterns.Creational.Factory.BasicFactory.Connection;

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
