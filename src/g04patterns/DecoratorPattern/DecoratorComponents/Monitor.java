package g04patterns.DecoratorPattern.DecoratorComponents;

import g04patterns.DecoratorPattern.Computer;

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
