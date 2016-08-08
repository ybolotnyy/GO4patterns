package GoFpatterns.Structural.Proxy;

import GoFpatterns.State.State_OOP.AutomatInterface;
import GoFpatterns.State.State_OOP.State;
import GoFpatterns.State.State_OOP.States.AppartmentRentedState;
import GoFpatterns.State.State_OOP.States.GotApplicationState;
import GoFpatterns.State.State_OOP.States.WaitingState;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AutomatServer implements Runnable, AutomatInterface {

  State waitingState;
  State gotApplicationState;
  State appartmentRentedState;
  State fullyRentedState;
  State state;
  int count;
  private Thread thread;
  ServerSocket socket;
  PrintWriter out;
  Socket communicationSocket;

  public static void main(String[] args) {
    AutomatServer d = new AutomatServer();
  }

  public AutomatServer() {
    count = 9;
    waitingState = new WaitingState(this);
    gotApplicationState = new GotApplicationState(this);
    appartmentRentedState = new AppartmentRentedState(this);
    waitingState = new WaitingState(this);
    state = waitingState;

    try {
      socket = new ServerSocket(8765);
      communicationSocket = socket.accept();
      out = new PrintWriter(communicationSocket.getOutputStream(), true);
      thread = new Thread(this);
      thread.start();
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void run() {
    String incomingString;
    try {
      BufferedReader in = new BufferedReader(new
              InputStreamReader(communicationSocket.getInputStream()));
      while ((incomingString = in.readLine()) != null) {
        if (incomingString.equals("gotApplication")) {
          gotApplication();
        } else if (incomingString.equals("checkApplication")) {
          checkApplication();
        } else if (incomingString.equals("rentAppartment")) {
          rentAppartment();
        }
      }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
  }

  public void gotApplication() {
    out.println(state.gotApplication());
  }

  public void checkApplication() {
    out.println(state.checkApplication());
  }

  public void rentAppartment() {
    out.println(state.rentAppartment());
    out.println(state.dispenseKeys());
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
