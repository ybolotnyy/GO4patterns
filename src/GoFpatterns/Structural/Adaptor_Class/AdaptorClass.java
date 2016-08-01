package GoFpatterns.Structural.Adaptor_Class;

import GoFpatterns.Structural.Adaptor_Object.SourceClass;

public class AdaptorClass extends GoFpatterns.Structural.Adaptor_Class.SourceClass{
    String firstName;
    String lastName;

    public AdaptorClass() {
        super();
    }

    public void setFirstName(String fn) {
        firstName = fn;
        super.setLongName(firstName + " " + lastName);
    }

    public void setLastName(String ln) {
        lastName = ln;
        super.setLongName(firstName + " " + lastName);
    }

    public String getFirstName() {
        firstName = super.getLongName().split(" ")[0];
        return firstName;
    }

    public String getLastName() {
        lastName = super.getLongName().split(" ")[1];
        return lastName;
    }
}
