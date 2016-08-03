package GoFpatterns.Creational.Builder;

import GoFpatterns.Creational.Builder.Interfaces.RobotBuildable;
import GoFpatterns.Creational.Builder.Interfaces.RobotBuilder;

import java.util.ArrayList;

public class RoboHooverBuilder implements RobotBuilder {
  RoboHooverBuildable robot;
  ArrayList<actionType> actions;

  public RoboHooverBuilder() {
    robot = new RoboHooverBuildable();
    actions = new ArrayList<actionType>();
  }

  public void addFindParts() {
    actions.add(actionType.findParts);
  }

  public void addAssembleit() {
    actions.add(actionType.assembleIt);
  }

  public void addSwitchOn() {
    actions.add(actionType.switchOn);
  }

  public void addSwitchOff() {
    actions.add(actionType.switchOff);
  }

  public void addTestIt() {
    actions.add(actionType.testIt);
  }

  public RobotBuildable getRobot() {
    robot.loadActions(actions);
    return robot;
  }
}
