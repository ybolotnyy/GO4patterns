package GoFpatterns.State.State_OOP.States;

import GoFpatterns.State.State_OOP.AutomatInterface;
import GoFpatterns.State.State_OOP.State;

import java.util.Random;

public class GotApplicationState implements State {

  AutomatInterface automat;
  Random random;

  public GotApplicationState(AutomatInterface a) {
    automat = a;
    random = new Random(System.currentTimeMillis());
  }

  public String gotApplication() {
    return "We already got your application";
  }

  public String checkApplication() {
    int yesno = random.nextInt() % 10;

    if (yesno > 4 && automat.getCount() > 0) {
      automat.setState(automat.getAppartmentRentedState());
      return "Congratulations, you were approved";
    } else {
      automat.setState((automat.getWaitingState()));
      return "Sorry, you weren't approved";
    }
  }

  public String rentAppartment() {
    return "You mast have your application checked";
  }

  public String dispenseKeys() {
    return "You mast have your application checked";
  }
}
