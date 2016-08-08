package GoFpatterns.State.State_OOP;

import GoFpatterns.State.State_OOP.States.AppartmentRentedState;
import GoFpatterns.State.State_OOP.States.GotApplicationState;
import GoFpatterns.State.State_OOP.States.WaitingState;

public class Automat implements AutomatInterface {
  State waitingState;
  State gotApplicationState;
  State appartmentRentedState;
  State fullyRentedState;
  int count;
  State state;

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

  public void getState(State s) {
    state = s;
  }

  public State getWaitingState() {
    return waitingState;
  }

  public State getGotApplicationState() {
    return gotApplicationState;
  }

  public State getAppartmentRentedState() {
    return appartmentRentedState;
  }

  public State getFullyRentedState() {
    return fullyRentedState;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int n) {
    count = n;
  }

  public void setState(State s) {
    state = s;
  }
}
