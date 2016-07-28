package g04patterns.Decorator.DecoratorComponents;

import g04patterns.Decorator.Computer;

/**
 * Created by byn on 7/21/16.
 */
public class Monitor extends ComponentDecorator {

    public Monitor(Computer computer) {
        super(computer);
    }

    public String description() {
       return super.computer.description() + " monitor \n";
    }
}
