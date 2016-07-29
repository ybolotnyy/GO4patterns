package GoFpatterns.Decorator.DecoratorComponents;

import GoFpatterns.Decorator.Computer;

/**
 * Created by byn on 7/21/16.
 */
public class DVD extends ComponentDecorator {

    public DVD(Computer computer) {
        super(computer);
    }

    public String description() {
       return super.computer.description() + " DVD \n";
    }
}
