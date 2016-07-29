package GoFpatterns.ChainOfResponsibility.ChainMembers;

import GoFpatterns.ChainOfResponsibility.HelpInterface;

public class Police implements HelpInterface {

    HelpInterface successor;

    public void getHelp(String helpCode) {
        System.out.println("This is Police Dept. How can I help you ?");
    }
}
