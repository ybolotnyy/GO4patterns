package GoFpatterns.Creational.Builder;

import GoFpatterns.Creational.Builder.Interfaces.RobotBuildable;

public class TestBuilderPattern {
  public static void main(String[] args) {
    RoboHooverBuilder builder;
    RobotBuildable robot;


    builder = new RoboHooverBuilder();
    builder.addFindParts();
    builder.addAssembleit();
    builder.addTestIt();

    robot = builder.getRobot();

    robot.go();
  }
}
