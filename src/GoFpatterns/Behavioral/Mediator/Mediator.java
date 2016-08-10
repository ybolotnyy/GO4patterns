package GoFpatterns.Behavioral.Mediator;

import GoFpatterns.Behavioral.Mediator.Pages.Exit;
import GoFpatterns.Behavioral.Mediator.Pages.Purchase;
import GoFpatterns.Behavioral.Mediator.Pages.Shop;
import GoFpatterns.Behavioral.Mediator.Pages.Welcome;

public class Mediator {
  Welcome welcome;
  Purchase purchase;
  Shop shop;
  Exit exit;

  public Mediator(){
    welcome = new Welcome(this);
    shop = new Shop(this);
    purchase = new Purchase(this);
    exit = new Exit(this);
  }

  public void handle(String state) {
    switch (state) {
      case "welcome.shop":
        shop.go();
      break;
      case "welcome.exit":
        exit.go();
        break;
      case "shop.purchase":
        purchase.go();
        break;
      case "shop.exit":
        exit.go();
        break;
      case "purchase.shop":
        shop.go();
        break;
      case "purchase.exit":
        exit.go();
        break;
      case "exit.shop":
        shop.go();
        break;
      default:
      System.out.println("Unhandled mediator state");
    }
  }
}
