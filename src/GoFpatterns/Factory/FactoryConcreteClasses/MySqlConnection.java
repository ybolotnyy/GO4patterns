package GoFpatterns.Factory.FactoryConcreteClasses;

import GoFpatterns.Factory.Connection;

public class MySqlConnection extends Connection
{
    public MySqlConnection()
    {

    }

    public String description()
    {
        return "MySQL connection";
    }
}
