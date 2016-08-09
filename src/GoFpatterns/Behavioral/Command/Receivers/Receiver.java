package GoFpatterns.Behavioral.Command.Receivers;

public interface Receiver {
  public void connect();
  public void diagnostics();
  public void reboot();
  public void disconnect();
  public void shutdown();
}
