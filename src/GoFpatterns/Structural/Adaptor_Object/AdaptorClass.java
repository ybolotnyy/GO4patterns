package GoFpatterns.Structural.Adaptor_Object;

public class AdaptorClass {
    SourceClass sourceObject;
    String firstName;
    String lastName;

    AdaptorClass(SourceClass so) {
        sourceObject = so;
        firstName = so.getLongName().split(" ")[0];
        lastName = so.getLongName().split(" ")[1];
    }

    public void setFirstName(String fn) {
        firstName = fn;
        sourceObject.setLongName(firstName + " " + lastName);
    }

    public void setLastName(String ln) {
        lastName = ln;
        sourceObject.setLongName(firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
