package GoFpatterns.State.State_OOP;

import javax.swing.plaf.nimbus.State;

public interface AutomatInterface {
  public void gotApplication();
  public void checkApplication();
  public void rentAppartment();
  public void getState(StateInterface s);
  public StateInterface getWaitingState();
  public StateInterface getGotApplicationState();
  public StateInterface getAppartmentRentedState();
  public StateInterface getFullyRentedState();
  public int getCount();
  public void setCount(int n);
  public void setState(StateInterface s);
}