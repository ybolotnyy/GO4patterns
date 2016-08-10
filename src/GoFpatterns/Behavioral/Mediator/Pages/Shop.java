package GoFpatterns.Behavioral.Mediator.Pages;

import GoFpatterns.Behavioral.Mediator.Mediator;

public class Shop implements Page {
  Mediator mediator;

  public Shop(Mediator m) {
    mediator = m;
  }
  
  public void go() {
    System.out.println("\nYou're on Shop page");

    switch (Util.getYesNo("Wanna purchase now ?")) {
      case 'y':
        mediator.handle("shop.purchase");
        break;
      case 'n':
      default:
        mediator.handle("shop.exit");
        break;
    }
  }
}
