package GoFpatterns.Behavioral.Iterator;

public class TestIteratorPattern {

  public static void main(String[] args) {
    TestIteratorPattern t = new TestIteratorPattern();
  }

  TestIteratorPattern(){

    Division division = new Division("AlfaBeta");

    division.addVP(new VP("Petr", "Customer Service"));
    division.addVP(new VP("Vlad", "Customer Support"));
    division.addVP(new VP("Marta", "Marketing"));
    division.addVP(new VP("Olga", "Sales"));
    division.addVP(new VP("Tonya", "IT"));
    division.addVP(new VP("Nick", "Eng"));

    DivisionIterator iterator = division.iterator();

    while (iterator.hasNext()) {
      VP vp = iterator.next();
      vp.print();
    }
  }
}


