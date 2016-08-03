package GoFpatterns.Behavioral.Template;

public class RoboHoover extends RobotTemplate {

  public RoboHoover(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  @Override
  public void findParts() {
    super.findParts();
    System.out.println("Looking for long cable");
    System.out.println("Looking for big brush");
  }

  @Override
  public Boolean isTestNeeded() {
    return false;
  }
}
