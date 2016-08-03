package GoFpatterns.Creational.Builder;

import GoFpatterns.Creational.Builder.Interfaces.RobotBuildable;
import java.util.ArrayList;
import java.util.Iterator;

import static GoFpatterns.Creational.Builder.Interfaces.RobotBuildable.actionType.findParts;

public class RoboHooverBuildable implements RobotBuildable {
  ArrayList<Integer> actions;


  public void loadActions(ArrayList a) {
    actions = a;
  }

  public void go() {
    Iterator<Integer> actionsIterator = actions.iterator();
    while (actionsIterator.hasNext()) {
      switch (actionsIterator.next()) {
        case 1: findParts();
          break;
        case 2: assembleIt();
          break;
        case 3: switchOn();
          break;
        case 4: switchOff();
          break;
        case 5: testIt();
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
