package GoFpatterns.Structural.Composite;

import GoFpatterns.Structural.Adaptor_Class.Test;

public class TestCompositePattern {
  public static void main(String[] args) {
    TestCompositePattern t = new TestCompositePattern();
  }

  public TestCompositePattern() {

    Corporation corporation = new Corporation();

    Division rnd = new Division("R&D");
    rnd.add(new VP("Steve", "R&D"));
    rnd.add(new VP("Martin", "R&D"));
    rnd.add(new VP("Chris", "R&D"));

    Division sales = new Division("Sales");
    sales.add(new VP("Jose", "Sales"));
    sales.add(new VP("Garry", "Sales"));
    sales.add(new VP("Steven", "Sales"));

    Division salesForce = new Division("Sales force");
    salesForce.add(new VP("Steven", "Sales rorce"));
    salesForce.add(new VP("Joane", "Sales force"));
    salesForce.add(new VP("Aliece", "Sales force"));

    sales.add(salesForce);

    VP vp = new VP("Garick", "nowhere");

    corporation.add(rnd);
    corporation.add(sales);
    corporation.add(vp);

    corporation.print();
  }
}
