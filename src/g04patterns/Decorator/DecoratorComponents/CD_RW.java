package g04patterns.Decorator.DecoratorComponents;

import g04patterns.Decorator.Computer;

/**
 * Created by byn on 7/21/16.
 */
public class CD_RW extends ComponentDecorator {

    public CD_RW(Computer computer) {
        super(computer);
    }

    public String description() {
       return super.computer.description() + " CD-RW \n";
    }
}