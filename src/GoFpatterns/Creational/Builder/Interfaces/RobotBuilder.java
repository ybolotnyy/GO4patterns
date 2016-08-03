package GoFpatterns.Creational.Builder.Interfaces;

public interface RobotBuilder {
  public void addFindParts();
  public void addAssembleit();
  public void addSwitchOn();
  public void addSwitchOff();
  public void addTestIt();
  public RobotBuildable getRobot();
}
