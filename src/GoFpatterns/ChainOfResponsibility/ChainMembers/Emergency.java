package GoFpatterns.ChainOfResponsibility.ChainMembers;

import GoFpatterns.ChainOfResponsibility.HelpInterface;

public class Emergency implements HelpInterface {

    HelpInterface successor;

    public Emergency(HelpInterface s) {
        successor = s;
    }

    public void getHelp(String helpCode) {
        if (helpCode != "trauma") {
            System.out.println("This is Emergency, forwarding you to Police");
            successor.getHelp(helpCode);
        } else {
            System.out.println("This is Emergency. How can I help you ?");
        }
    }
}
