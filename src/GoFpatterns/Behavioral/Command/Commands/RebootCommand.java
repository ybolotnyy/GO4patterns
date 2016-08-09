package GoFpatterns.Behavioral.Command.Commands;

import GoFpatterns.Behavioral.Command.Receivers.Receiver;

public class RebootCommand implements Command {
  Receiver receiver;

  public RebootCommand(Receiver r) {
    receiver = r;
  }

  public void execute() {
    receiver.connect();
    receiver.reboot();
    receiver.disconnect();
    System.out.println();
  }
}
