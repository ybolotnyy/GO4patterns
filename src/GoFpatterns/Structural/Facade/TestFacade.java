package GoFpatterns.Structural.Facade;

public class TestFacade {

    public static void main(String[] args){
        TestFacade t = new TestFacade();
    }

    public TestFacade() {
        FacadeDifficultToSimple facade = new FacadeDifficultToSimple();
        System.out.println("Let's change name through a facade");
        facade.setName("XYZ");

        System.out.println("The name is: " + facade.getName());
    }
}

