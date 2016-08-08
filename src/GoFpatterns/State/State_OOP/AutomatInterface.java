package GoFpatterns.State.State_OOP;

public interface AutomatInterface {
  public void gotApplication();
  public void checkApplication();
  public void rentAppartment();
  public void getState(State s);
  public State getWaitingState();
  public State getGotApplicationState();
  public State getAppartmentRentedState();
  public State getFullyRentedState();
  public int getCount();
  public void setCount(int n);
  public void setState(State s);
}