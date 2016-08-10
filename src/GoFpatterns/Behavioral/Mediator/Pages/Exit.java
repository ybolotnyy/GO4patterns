package GoFpatterns.Behavioral.Mediator.Pages;

import GoFpatterns.Behavioral.Mediator.Mediator;

public class Exit implements Page {
  Mediator mediator;

  public Exit(Mediator m) {
    mediator = m;
  }
  
  public void go() {
    System.out.println("\nYou're on Exit page");

    switch (Util.getYesNo("Wanna shop again ?")) {
      case 'y':
        mediator.handle("exit.shop");
        break;
      case 'n':
      default:
        System.out.println("Goodbye & come back again :)");
        break;
    }
  }
}
