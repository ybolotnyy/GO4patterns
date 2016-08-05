package GoFpatterns.Structural.Composite;

import java.util.Iterator;

public class VPIterator implements Iterator {
  private VP vp;

  public VPIterator(VP v){
    vp = v;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public VP next() {
    return vp;
  }
}
