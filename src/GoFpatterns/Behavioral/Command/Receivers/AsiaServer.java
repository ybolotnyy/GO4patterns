package GoFpatterns.Behavioral.Command.Receivers;

public class AsiaServer implements Receiver {
  String CLASS_NAME = getClass().getSimpleName();

  public void connect() {
    System.out.println("You are connected to " + CLASS_NAME);
  }

  public void diagnostics() {
    System.out.println("The " + CLASS_NAME + " diagnostics check out OK");
  }

  public void reboot() {
    System.out.println("Rebooting the " + CLASS_NAME);
  }

  public void disconnect() {
    System.out.println("You're disconnected from the " + CLASS_NAME);
  }

  public void shutdown() {
    System.out.println("Shutting down the " + CLASS_NAME);
  }
}
