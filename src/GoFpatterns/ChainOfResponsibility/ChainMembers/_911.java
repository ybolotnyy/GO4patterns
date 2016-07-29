package GoFpatterns.ChainOfResponsibility.ChainMembers;

import GoFpatterns.ChainOfResponsibility.HelpInterface;

public class _911 implements HelpInterface {

    HelpInterface successor;

    public _911(HelpInterface s) {
        successor = s;
    }

    public void getHelp(String helpCode) {
        System.out.printf("Issue: %s \n", helpCode);

        if (helpCode != "911") {
            System.out.println("This is 911, forwarding you to FireDept");
            successor.getHelp(helpCode);
        } else {
            System.out.println("This is 911. How can I help you ?");
        }
    }
}
