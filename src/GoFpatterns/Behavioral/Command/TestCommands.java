package GoFpatterns.Behavioral.Command;

import GoFpatterns.Behavioral.Command.Commands.Command;
import GoFpatterns.Behavioral.Command.Commands.RebootCommand;
import GoFpatterns.Behavioral.Command.Commands.RunDiagnosticsCommand;
import GoFpatterns.Behavioral.Command.Receivers.AsiaServer;
import GoFpatterns.Behavioral.Command.Receivers.EuropeServer;
import GoFpatterns.Behavioral.Command.Receivers.Receiver;
import GoFpatterns.Behavioral.Command.Receivers.USAServer;

public class TestCommands {

  public static void main(String[] args) {
    Receiver asiaServer = new AsiaServer();
    Command rebootAsia = new RebootCommand(asiaServer);
    rebootAsia.execute();

    Receiver europeServer = new EuropeServer();
    Command diasnosticsEurope = new RunDiagnosticsCommand(europeServer);
    diasnosticsEurope.execute();

    new RunDiagnosticsCommand(new USAServer()).execute();
  }

}
