package GoFpatterns.Behavioral.Mediator.Pages;

import GoFpatterns.Behavioral.Mediator.Mediator;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Purchase implements Page {
  Mediator mediator;

  public Purchase(Mediator m) {
    mediator = m;
  }
  
  public void go() {
    System.out.println("\nYou're on Purchase page");

    switch (Util.getYesNo("Wanna shop again ?")) {
      case 'y':
        mediator.handle("purchase.shop");
        break;
      case 'n':
      default:
        mediator.handle("purchase.exit");
        break;
    }
  }
}
