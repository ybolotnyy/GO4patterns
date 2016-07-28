package g04patterns.Factory;

import g04patterns.Factory.FactoryConcreteClasses.MySqlConnection;
import g04patterns.Factory.FactoryConcreteClasses.OracleConnection;
import g04patterns.Factory.FactoryConcreteClasses.SqlServerConnection;

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
