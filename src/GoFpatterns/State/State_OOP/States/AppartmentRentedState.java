package GoFpatterns.State.State_OOP.States;

import GoFpatterns.State.State_OOP.Automat;
import GoFpatterns.State.State_OOP.AutomatInterface;
import GoFpatterns.State.State_OOP.StateInterface;

public class AppartmentRentedState implements StateInterface {
  AutomatInterface automat;

  public AppartmentRentedState(AutomatInterface a) {
    automat = a;
  }


  public String gotApplication() {
    return "We're in procecess of renting you an appartment";
  }

  public String checkApplication() {
    return "We're in procecess of renting you an appartment";
  }

  public String rentAppartment() {
    automat.setCount(automat.getCount() - 1);
    return "Renting you an appartment....";
  }

  public String dispenseKeys() {
    if (automat.getCount() <=0) {
      automat.setState(automat.getFullyRentedState());
    } else {
      automat.getWaitingState();
    }
    return "Here are your keys!";
  }
}
