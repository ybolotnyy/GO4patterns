package g04patterns.FactoryPatternGoFway;

import g04patterns.FactoryPatternGoFway.Connection;
import g04patterns.FactoryPatternGoFway.FactorConcreteClasses.MySqlConnection;
import g04patterns.FactoryPatternGoFway.FactorConcreteClasses.OracleConnection;
import g04patterns.FactoryPatternGoFway.FactorConcreteClasses.SqlServerConnection;

public class ConcreteFactory extends AbstractFactory
{
    public Connection createConnection(String type)
    {
        switch (type)
        {
            case "Oracle"       : return new OracleConnection();
            case "SQL Server"   : return new SqlServerConnection();
            default             : return new MySqlConnection();
        }
    }
}
