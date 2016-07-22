package g04patterns.DecoratorPattern.DecoratorComponents;

import g04patterns.DecoratorPattern.Computer;

/**
 * Created by byn on 7/21/16.
 */
abstract class ComponentDecorator extends Computer {
    Computer computer;

    ComponentDecorator (Computer c) {
        computer = c;
    }
}
