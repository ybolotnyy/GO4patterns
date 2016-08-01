package GoFpatterns.Structural.AdaptorObject;

public class Test {

    public static void main(String[] args) {
        SourceClass source = new SourceClass();
        source.setName("Ivan Petrov");

        SuccessorClass adaptor = new SuccessorClass(source);
        System.out.printf("First name: %s \n" +
                           "Last name: %s \n",
                adaptor.getFirstName(),
                adaptor.getLastName());
    }
}
