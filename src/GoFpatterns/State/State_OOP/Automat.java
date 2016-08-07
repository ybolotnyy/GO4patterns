package GoFpatterns.State.State_OOP;

import GoFpatterns.State.State_OOP.States.AppartmentRentedState;
import GoFpatterns.State.State_OOP.States.GotApplicationState;
import GoFpatterns.State.State_OOP.States.WaitingState;

public class Automat implements AutomatInterface {
  StateInterface waitingState;
  StateInterface gotApplicationState;
  StateInterface appartmentRentedState;
  StateInterface fullyRentedState;
  int count;
  StateInterface state;

  public Automat (int n) {
    count = n;
    waitingState = new WaitingState(this);
    gotApplicationState = new GotApplicationState(this);
    appartmentRentedState = new AppartmentRentedState(this);
    waitingState = new WaitingState(this);
    state = waitingState;
  }

  public void gotApplication() {
    System.out.println(state.gotApplication());
  }

  public void checkApplication() {
    System.out.println(state.checkApplication());
  }

  public void rentAppartment() {
    System.out.println(state.rentAppartment());
    System.out.println(state.dispenseKeys());
  }

  public void getState(StateInterface s) {
    state = s;
  }

  public StateInterface getWaitingState() {
    return waitingState;
  }

  public StateInterface getGotApplicationState() {
    return gotApplicationState;
  }

  public StateInterface getAppartmentRentedState() {
    return appartmentRentedState;
  }

  public StateInterface getFullyRentedState() {
    return fullyRentedState;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int n) {
    count = n;
  }

  public void setState(StateInterface s) {
    state = s;
  }
}
