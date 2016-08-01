package GoFpatterns.Structural.AdaptorObject;

public class SuccessorClass implements SuccessorInterface{
    SourceClass sourceObject;
    String firstName;
    String lastName;

    SuccessorClass(SourceClass so) {
        sourceObject = so;
        firstName = so.getName().split(" ")[0];
        lastName = so.getName().split(" ")[1];
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
