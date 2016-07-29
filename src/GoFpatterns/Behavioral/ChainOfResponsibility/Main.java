package GoFpatterns.Behavioral.ChainOfResponsibility;


import GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers.Emergency;
import GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers.FireDept;
import GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers.Police;
import GoFpatterns.Behavioral.ChainOfResponsibility.ChainMembers._911;

public class Main {

    public static void main(String[] args) {

        String SHOOTING = "shooting";
        String TRAUMA = "trauma";
        String FIRE = "fire";

        Police police = new Police();
        Emergency emergency = new Emergency(police);
        FireDept fireDept = new FireDept(emergency);
        _911 nineOneOne = new _911(fireDept);

        nineOneOne.getHelp("fire");
        System.out.println();

        nineOneOne.getHelp("trauma");
        System.out.println();

        nineOneOne.getHelp("shooting");
        System.out.println();

    }
}
