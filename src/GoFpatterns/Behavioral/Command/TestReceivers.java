package GoFpatterns.Behavioral.Command;

import GoFpatterns.Behavioral.Command.Receivers.AsiaServer;
import GoFpatterns.Behavioral.Command.Receivers.EuropeServer;
import GoFpatterns.Behavioral.Command.Receivers.Receiver;
import GoFpatterns.Behavioral.Command.Receivers.USAServer;

public class TestReceivers {

  public static void main(String[] args) {
    Receiver asiaServer = new AsiaServer();
    asiaServer.connect();
    asiaServer.diagnostics();
    asiaServer.reboot();
    asiaServer.shutdown();
    asiaServer.disconnect();

    Receiver europeServer = new EuropeServer();
    europeServer.connect();
    europeServer.diagnostics();
    europeServer.reboot();
    europeServer.shutdown();
    europeServer.disconnect();

    Receiver usaServer = new USAServer();
    usaServer.connect();
    usaServer.diagnostics();
    usaServer.reboot();
    usaServer.shutdown();
    usaServer.disconnect();
  }

}
