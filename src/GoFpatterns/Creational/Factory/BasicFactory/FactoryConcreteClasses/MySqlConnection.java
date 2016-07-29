package GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses;

import GoFpatterns.Creational.Factory.BasicFactory.Connection;

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
