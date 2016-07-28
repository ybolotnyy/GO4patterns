package g04patterns.FactoryGoFway;

public abstract class AbstractFactory
{
    AbstractFactory()
    {

    }

    protected abstract Connection createConnection(String type);
}
