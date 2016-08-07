package GoFpatterns.State.State_OOP;

public class TestAutomat {
  Automat automat;

  public static void main(String[] args) {
    TestAutomat t = new TestAutomat();
  }

  public TestAutomat() {
    automat = new Automat(9);

    automat.gotApplication();
    automat.checkApplication();
    automat.rentAppartment();
  }
}
