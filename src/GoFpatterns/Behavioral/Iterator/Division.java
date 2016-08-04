package GoFpatterns.Behavioral.Iterator;

public class Division {
  private VP[] vps;
  private int number;
  private String name;

  Division(String n) {
    name = n;
    number = 0;
    vps = new VP[10];
  }

  public DivisionIterator iterator(){
    return new DivisionIterator(vps);
  }

  public void addVP(VP vp) {
    vps[number] = vp;
    number++;
  }
}
