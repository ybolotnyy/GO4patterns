package GoFpatterns.Creational.Factory.GoFwayFactory;

import GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses.MySqlConnection;
import GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses.OracleConnection;
import GoFpatterns.Creational.Factory.GoFwayFactory.FactorConcreteClasses.SqlServerConnection;

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
