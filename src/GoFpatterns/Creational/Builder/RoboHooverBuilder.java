package GoFpatterns.Creational.Builder;

import GoFpatterns.Creational.Builder.Interfaces.RobotBuildable;
import GoFpatterns.Creational.Builder.Interfaces.RobotBuilder;

import java.util.ArrayList;

public class RoboHooverBuilder implements RobotBuilder {
  RoboHooverBuildable robot;
  ArrayList<Integer> actions;

  public RoboHooverBuilder() {
    robot = new RoboHooverBuildable();
    actions = new ArrayList<Integer>();
  }

  public void addFindParts() {
    actions.add(new Integer(1));
  }

  public void addAssembleit() {
    actions.add(new Integer(2));
  }

  public void addSwitchOn() {
    actions.add(new Integer(3));
  }

  public void addSwitchOff() {
    actions.add(new Integer(4));
  }

  public void addTestIt() {
    actions.add(new Integer(5));
  }

  public RobotBuildable getRobot() {
    robot.loadActions(actions);
    return robot;
  }
}
