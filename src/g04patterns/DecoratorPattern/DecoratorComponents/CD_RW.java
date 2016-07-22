package g04patterns.DecoratorPattern.DecoratorComponents;

import g04patterns.DecoratorPattern.Computer;

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
