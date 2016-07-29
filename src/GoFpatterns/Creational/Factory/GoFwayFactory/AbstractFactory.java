package GoFpatterns.Creational.Factory.GoFwayFactory;

public abstract class AbstractFactory
{
    AbstractFactory()
    {

    }

    protected abstract Connection createConnection(String type);
}
