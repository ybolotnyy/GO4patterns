package GoFpatterns.State.State_OOP.States;

import GoFpatterns.State.State_OOP.Automat;
import GoFpatterns.State.State_OOP.AutomatInterface;
import GoFpatterns.State.State_OOP.StateInterface;

public class WaitingState implements StateInterface {

  AutomatInterface automat;

  public WaitingState(AutomatInterface a) {
    automat = a;
  }

  public String gotApplication() {
    automat.setState(automat.getGotApplicationState());
    return "Thanks for the application";
  }

  public String checkApplication() {
    return "You have to submit an application";
  }

  public String rentAppartment() {
    return "You have to submit an application";
  }

  public String dispenseKeys() {
    return "You have to submit an application";
  }
}
