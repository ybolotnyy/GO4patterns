package g04patterns.FactoryPattern.FactoryConcreteClasses;

import g04patterns.FactoryPattern.Connection;

import java.util.Collections;

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
