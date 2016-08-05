package GoFpatterns.Structural.Composite;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
  private Corporate[] corporate;
  private int location;

  public DivisionIterator(Corporate[] c) {
    corporate = c;
    location = 0;
  }

  public boolean hasNext() {
    if (location < corporate.length && corporate[location] != null) {
      return true;
    } else {
      return false;
    }
  }

  public Corporate next() {
    return corporate[location++];
  }
}
