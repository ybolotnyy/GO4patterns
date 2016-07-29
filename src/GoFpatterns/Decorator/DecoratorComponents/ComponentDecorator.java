package GoFpatterns.Decorator.DecoratorComponents;

import GoFpatterns.Decorator.Computer;

/**
 * Created by byn on 7/21/16.
 */
abstract class ComponentDecorator extends Computer {
    Computer computer;

    ComponentDecorator (Computer c) {
        computer = c;
    }
}
