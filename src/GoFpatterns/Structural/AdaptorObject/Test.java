package GoFpatterns.Structural.AdaptorObject;

public class Test {

    public static void main(String[] args) {
        SourceClass source = new SourceClass();
        source.setName("Ivan Petrov");

        AdaptorClass adaptor = new AdaptorClass(source);

        System.out.printf("First name: %s \n" +
                           "Last name: %s \n",
                adaptor.getFirstName(),
                adaptor.getLastName());

        adaptor.setFirstName("Petr");
        System.out.printf("sourceObject > name: %s \n",
                source.getName());

        adaptor.setLastName("Ivanov");
        System.out.printf("sourceObject > name: %s \n",
                source.getName());
    }
}
