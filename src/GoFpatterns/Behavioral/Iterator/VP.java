package GoFpatterns.Behavioral.Iterator;

public class VP {
  private String name;
  private String division;

  VP(String n, String d) {
    name = n;
    division = d;
  }

  public String getName() {
    return name;
  }

  public void print() {
    System.out.printf("VP's name: %s, division: %s \n", name, division);
  }
}
