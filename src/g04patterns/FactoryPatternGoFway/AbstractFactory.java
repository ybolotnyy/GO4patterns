package g04patterns.FactoryPatternGoFway;

import g04patterns.FactoryPatternGoFway.Connection;

public abstract class AbstractFactory
{
    AbstractFactory()
    {

    }

    protected abstract Connection createConnection(String type);
}
