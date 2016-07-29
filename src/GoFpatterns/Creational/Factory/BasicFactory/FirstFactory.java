package GoFpatterns.Creational.Factory.BasicFactory;

import GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses.MySqlConnection;
import GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses.OracleConnection;
import GoFpatterns.Creational.Factory.BasicFactory.FactoryConcreteClasses.SqlServerConnection;

public class FirstFactory
{
    protected String type;

    public FirstFactory(String t)
    {
       type = t;
    }

    public Connection createConnection()
    {
        switch (type)
        {
            case "Oracle"       : return new OracleConnection();
            case "SQL Server"   : return new SqlServerConnection();
            default             : return new MySqlConnection();
        }
    }
}
