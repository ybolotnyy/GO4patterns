package GoFpatterns.Behavioral.Iterator;

import java.util.Iterator;

public class DivisionIterator implements Iterator {
  VP[] vps;
  int location;

  DivisionIterator(VP[] vps) {
    this.vps = vps;
    location = 0;
  }

  public boolean hasNext() {
    if ((location < vps.length) && (vps[location] != null)) {
      return true;
    } else {
      System.out.printf("Iterator reach the end out of collection: %d / %d \n",
              location,
              vps.length);

      return false;
    }
  }

  public VP next() {
      return vps[location++];
  }

  public void remove() {

  }
}
