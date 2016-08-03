package GoFpatterns.Behavioral.Template;

public abstract class RobotTemplate {
    String name;

    public RobotTemplate() {
      System.out.println("Hi! I'm robot");
    }

    public void findParts()
    {
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

    public Boolean isTestNeeded() {
        return true;
    }

    public void testIt() {
      System.out.println("Testing...");
    }

    public void go() {
      findParts();
      assembleIt();
      switchOn();
      if (isTestNeeded()) {
        System.out.println("Test is needed");
        testIt();
      } else {
        System.out.println("Test is *not* needed");
      }
      switchOff();
    }
}
