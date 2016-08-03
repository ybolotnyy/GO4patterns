package GoFpatterns.Behavioral.Template;

public class TestTemplatePattern {
  public static void main(String[] args) {
    RoboHoover hover = new RoboHoover("Robo-hoover");
    System.out.println("My name is " + hover.getName());
    hover.go();

    System.out.println("-----------------------------");

    RoboUber roboUber = new RoboUber("Robo-Uber");
    System.out.println("My name is " + roboUber.getName());
    roboUber.go();
  }
}
