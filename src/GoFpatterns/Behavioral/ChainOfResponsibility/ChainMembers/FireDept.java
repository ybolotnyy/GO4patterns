package GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers;

import GoFpatterns.Behavioral.ChainOfResponsibility.HelpInterface;

public class FireDept implements HelpInterface {

    HelpInterface successor;

    public FireDept(HelpInterface s) {
        successor = s;
    }

    public void getHelp(String helpCode) {
        if (helpCode != "fire") {
            System.out.println("This is FireDept, forwarding you to Emergency");
            successor.getHelp(helpCode);
        } else {
            System.out.println("This is FireDept. How can I help you ?");
        }
    }
}
