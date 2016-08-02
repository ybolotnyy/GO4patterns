package GoFpatterns.Structural.Facade;

public class FacadeDifficultToSimple {

    DifficultProduct difficultProduct;

    public FacadeDifficultToSimple() {
        this.difficultProduct = new DifficultProduct();
        //this.difficultProduct = difficultProduct;
    }

    public void setName(String name) {
        char[] chars = name.toCharArray();

        if (chars.length > 0 ) {
            difficultProduct.setFirstChar(chars[0]);
        }

        if (chars.length > 1 ) {
            difficultProduct.setSecondChar(chars[1]);
        }

        if (chars.length > 2 ) {
            difficultProduct.setThirdChar(chars[2]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }
}
