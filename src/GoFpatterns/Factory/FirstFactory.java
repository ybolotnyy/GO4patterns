package GoFpatterns.Factory;

import GoFpatterns.Factory.FactoryConcreteClasses.MySqlConnection;
import GoFpatterns.Factory.FactoryConcreteClasses.OracleConnection;
import GoFpatterns.Factory.FactoryConcreteClasses.SqlServerConnection;

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
