package GoFpatterns.Behavioral.Command.Commands;

import GoFpatterns.Behavioral.Command.Receivers.Receiver;

public class ShutdownCommand implements Command {
  Receiver receiver;

  public ShutdownCommand(Receiver r) {
    receiver = r;
  }

  public void execute() {
    receiver.connect();
    receiver.shutdown();
    receiver.disconnect();
    System.out.println();
  }

  public void undo() {
    receiver.connect();
    receiver.reboot();
    receiver.disconnect();
    System.out.println();
  }
}
