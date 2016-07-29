package GoFpatterns.Structural.Decorator;

import GoFpatterns.Structural.Decorator.DecoratorComponents.*;

/**
 * Created by byn on 7/21/16.
 */
public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new DVD(computer);
        computer = new CD_RW(computer);
        computer = new Keyboard(computer);

        System.out.println(computer.description());
    }
}
