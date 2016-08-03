package GoFpatterns.Creational.Builder;

public class TestBuilderPattern {
  public static void main(String[] args) {

    RoboHooverBuilder roboHooverBuilder = new RoboHooverBuilder();
    roboHooverBuilder.addFindParts();
    roboHooverBuilder.addAssembleit();
    roboHooverBuilder.addTestIt();
    roboHooverBuilder.getRobot().go();
  }
}
