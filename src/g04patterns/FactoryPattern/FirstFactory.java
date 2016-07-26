package g04patterns.FactoryPattern;

import g04patterns.FactoryPattern.FactoryConcreteClasses.MySqlConnection;
import g04patterns.FactoryPattern.FactoryConcreteClasses.OracleConnection;
import g04patterns.FactoryPattern.FactoryConcreteClasses.SqlServerConnection;

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
