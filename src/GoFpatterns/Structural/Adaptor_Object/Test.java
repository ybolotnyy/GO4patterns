package GoFpatterns.Structural.Adaptor_Object;

public class Test {

    public static void main(String[] args) {
        SourceClass sourceObject = new SourceClass();
        sourceObject.setLongName("Ivan Petrov");

        AdaptorClass adaptor = new AdaptorClass(sourceObject);

        System.out.printf("First name: %s \n" +
                           "Last name: %s \n",
                adaptor.getFirstName(),
                adaptor.getLastName());

        adaptor.setFirstName("Petr");
        adaptor.setLastName("Ivanov");

        System.out.printf("sourceObject > name: %s \n",
                sourceObject.getLongName());
    }
}
