package g04patterns.FactoryGoFway;

import g04patterns.FactoryGoFway.FactorConcreteClasses.MySqlConnection;
import g04patterns.FactoryGoFway.FactorConcreteClasses.OracleConnection;
import g04patterns.FactoryGoFway.FactorConcreteClasses.SqlServerConnection;

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
