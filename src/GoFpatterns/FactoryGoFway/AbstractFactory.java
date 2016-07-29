package GoFpatterns.FactoryGoFway;

public abstract class AbstractFactory
{
    AbstractFactory()
    {

    }

    protected abstract Connection createConnection(String type);
}
