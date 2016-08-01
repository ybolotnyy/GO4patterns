package GoFpatterns.Structural.AdaptorObject;

public class AdaptorClass implements AdaptorInterface {
    SourceClass sourceObject;
    String firstName;
    String lastName;

    AdaptorClass(SourceClass so) {
        sourceObject = so;
        firstName = so.getName().split(" ")[0];
        lastName = so.getName().split(" ")[1];
    }

    public void setFirstName(String fn) {
        firstName = fn;
        sourceObject.setName(firstName + " " + lastName);
    }

    public void setLastName(String ln) {
        lastName = ln;
        sourceObject.setName(firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
