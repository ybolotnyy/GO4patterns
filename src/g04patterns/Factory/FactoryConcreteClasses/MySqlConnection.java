package g04patterns.Factory.FactoryConcreteClasses;

import g04patterns.Factory.Connection;

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
