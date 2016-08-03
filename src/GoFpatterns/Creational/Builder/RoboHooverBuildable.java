package GoFpatterns.Creational.Builder;

import GoFpatterns.Creational.Builder.Interfaces.RobotBuildable;
import java.util.ArrayList;
import java.util.Iterator;

public class RoboHooverBuildable implements RobotBuildable {
  ArrayList<actionType> actions;


  public void loadActions(ArrayList a) {
    actions = a;
  }

  public void go() {
    Iterator<actionType> actionsIterator = actions.iterator();
    while (actionsIterator.hasNext()) {
      switch (actionsIterator.next()) {
        case findParts: findParts();
          break;
        case assembleIt: assembleIt();
          break;
        case switchOn: switchOn();
          break;
        case switchOff: switchOff();
          break;
        case testIt: testIt();
          break;
      }
    }
  }

  public void findParts() {
    System.out.println("Looking for needed parts...");
  }

  public void assembleIt() {
    System.out.println("Assembling...");
  }

  public void switchOn() {
    System.out.println("Switched ON");
  }

  public void switchOff() {
    System.out.println("Switched OFF");
  }

  public void testIt() {
    System.out.println("Testing...");
  }
}
