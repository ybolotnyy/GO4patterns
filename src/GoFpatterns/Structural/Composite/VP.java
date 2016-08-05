package GoFpatterns.Structural.Composite;

import java.util.Iterator;

public class VP extends Corporate {
  private String name;
  private String division;

  public VP(String n, String d) {
    name = n;
    division = d;
  }

  public String getName() {
    return name;
  }

  public void print() {
    System.out.printf("VP %s from '%s' division", name, division);
  }

  public Iterator iterator(){
    return new VPIterator(this);
  }
}
