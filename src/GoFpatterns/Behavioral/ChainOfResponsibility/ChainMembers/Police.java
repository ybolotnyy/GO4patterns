package GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers;

import GoFpatterns.Behavioral.ChainOfResponsibility.HelpInterface;

public class Police implements HelpInterface {

    HelpInterface successor;

    public void getHelp(String helpCode) {
        System.out.println("This is Police Dept. How can I help you ?");
    }
}
