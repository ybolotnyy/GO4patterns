package GoFpatterns.Creational.Builder;

public class TestBuilderPattern {
  public static void main(String[] args) {
    RoboHooverBuilder builder;


    builder = new RoboHooverBuilder();
    builder.addFindParts();
    builder.addAssembleit();
    builder.addTestIt();


    builder.getRobot().go();


  }
}
