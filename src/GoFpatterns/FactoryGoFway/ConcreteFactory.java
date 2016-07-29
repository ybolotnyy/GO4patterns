package GoFpatterns.FactoryGoFway;

import GoFpatterns.FactoryGoFway.FactorConcreteClasses.MySqlConnection;
import GoFpatterns.FactoryGoFway.FactorConcreteClasses.OracleConnection;
import GoFpatterns.FactoryGoFway.FactorConcreteClasses.SqlServerConnection;

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
