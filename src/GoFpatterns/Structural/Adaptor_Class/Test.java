package GoFpatterns.Structural.Adaptor_Class;


public class Test {

    public static void main(String[] args) {

        AdaptorClass adaptor = new AdaptorClass();
        adaptor.setFirstName("Ivan");
        adaptor.setLastName("Danko");

        System.out.printf("First name: %s \n" +
                           "Last name: %s \n",
                adaptor.getFirstName(),
                adaptor.getLastName());

        adaptor.setFirstName("Petr");
        adaptor.setLastName("Ivanov");

        System.out.printf("First name: %s \n" +
                        "Last name: %s \n",
                adaptor.getFirstName(),
                adaptor.getLastName());
    }
}
