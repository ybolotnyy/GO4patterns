package GoFpatterns.Structural.Composite;

import java.util.Iterator;

public class VPIterator implements Iterator {
  private VP vp;

  public VPIterator(VP v){
    vp = v;
  }

  public boolean hasNext() {
    return false;
  }

  public VP next() {
    return vp;
  }
}
