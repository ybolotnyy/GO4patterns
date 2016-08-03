package GoFpatterns.Creational.Builder.Interfaces;

public interface RobotBuilder {
  public enum actionType {
    findParts,
    assembleIt,
    switchOn,
    switchOff,
    testIt
  }

  public void addFindParts();
  public void addAssembleit();
  public void addSwitchOn();
  public void addSwitchOff();
  public void addTestIt();
  public RobotBuildable getRobot();
}
