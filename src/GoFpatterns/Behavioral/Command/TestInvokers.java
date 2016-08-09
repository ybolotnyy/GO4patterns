package GoFpatterns.Behavioral.Command;

import GoFpatterns.Behavioral.Command.Commands.Command;
import GoFpatterns.Behavioral.Command.Commands.RebootCommand;
import GoFpatterns.Behavioral.Command.Commands.RunDiagnosticsCommand;
import GoFpatterns.Behavioral.Command.Commands.ShutdownCommand;
import GoFpatterns.Behavioral.Command.Receivers.*;

public class TestInvokers {

  public static void main(String[] args) {

    Receiver asiaServer = new AsiaServer();
    Command rebootAsia = new RebootCommand(asiaServer);
    Command shutdownAsia = new ShutdownCommand(asiaServer);
    Command runDiagnosticsAsia = new RunDiagnosticsCommand(asiaServer);

    Receiver europeServer = new EuropeServer();
    Command rebootEurope = new RebootCommand(europeServer);
    Command shutdownEurope = new ShutdownCommand(europeServer);
    Command runDiagnosticsEurope = new RunDiagnosticsCommand(europeServer);

    Receiver usaServer = new USAServer();
    Command rebootUSA = new RebootCommand(usaServer);
    Command shutdownUSA = new ShutdownCommand(usaServer);
    Command runDiagnosticsUSA = new RunDiagnosticsCommand(usaServer);

    Invoker shutdownAllservers = new Invoker("Shut all servers down");
    shutdownAllservers.addCommand(shutdownAsia);
    shutdownAllservers.addCommand(shutdownEurope);
    shutdownAllservers.addCommand(shutdownUSA);

    Invoker rebootAllservers = new Invoker("Reboot all servers");
    rebootAllservers.addCommand(rebootAsia);
    rebootAllservers.addCommand(rebootEurope);
    rebootAllservers.addCommand(rebootUSA);

    rebootAllservers.run();
    shutdownAllservers.run();

    shutdownAllservers.undo();
  }

}
