package GoFpatterns.Structural.Composite;

import java.util.Iterator;

public class Division extends Corporate {
  private String name;
  private int number = 0;
  Corporate[] corporate = new Corporate[10];

  public Division(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void add(Corporate c) {
    corporate[number++] = c;
  }

  public Iterator iterator() {
    return new DivisionIterator(corporate);
  }

  public void print() {
    Iterator iterator = iterator();

    while (iterator.hasNext()) {
      Corporate c = (Corporate) iterator.next();
      c.print();
    }
  }
}
