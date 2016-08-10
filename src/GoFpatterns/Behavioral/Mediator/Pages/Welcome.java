package GoFpatterns.Behavioral.Mediator.Pages;

import GoFpatterns.Behavioral.Mediator.Mediator;

public class Welcome implements Page {
  Mediator mediator;

  public Welcome(Mediator m) {
    mediator = m;
  }
  
  public void go() {
    System.out.println("\nYou're on Welcome page");

    switch (Util.getYesNo("Wanna shop now ?")) {
      case 'y':
        mediator.handle("welcome.shop");
        break;
      case 'n':
      default:
        mediator.handle("welcome.exit");
        break;
    }
  }
}
