package GoFpatterns.Structural.Adaptor_Class;

public class SourceClass {
    String longName;

    public SourceClass(String n) {
        longName = n;
    }

    public void setLongName(String n) {
        longName = n;
    }

    public String getLongName() {
        return longName;
    }
}
