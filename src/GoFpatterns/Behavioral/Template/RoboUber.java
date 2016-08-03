package GoFpatterns.Behavioral.Template;

public class RoboUber extends RobotTemplate {

  public RoboUber(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void findParts() {
    super.findParts();
    System.out.println("Looking for a good car");
    System.out.println("Looking for a good tires");
  }

  public Boolean isTestNeeded() {
    return true;
  }
}
