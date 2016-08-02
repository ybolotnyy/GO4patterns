package GoFpatterns.Structural.Facade;

import java.util.Arrays;

public class DifficultProduct {
    char name[];

    public DifficultProduct(){
        name = new char[3];
        setFirstChar('Z');
        setSecondChar('Y');
        setThirdChar('X');
        System.out.println("New difficult product was created: '" + getName()  + "'");
    }

    public void setFirstChar(char ch){
        name[0] = ch;
    }

    public void setSecondChar(char ch){
        name[1] = ch;
    }

    public void setThirdChar(char ch){
        name[2] = ch;
    }

    public String getName() {
        return String.valueOf(name);
    }
}
