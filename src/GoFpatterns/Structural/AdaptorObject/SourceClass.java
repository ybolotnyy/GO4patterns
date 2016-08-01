package GoFpatterns.Structural.AdaptorObject;

public class SourceClass implements SourceInterface {
    String longName;

    public void setName(String n) {
        longName = n;
    }

    public String getName() {
        return longName;
    }
}
