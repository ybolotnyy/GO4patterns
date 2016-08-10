package GoFpatterns.Behavioral.Mediator.Pages;

import java.util.Scanner;

public class Util {

  public static char getYesNo(String question) {
    Scanner reader = new Scanner(System.in);
    System.out.println(question + " y/n ");
    char yesNo = reader.next().charAt(0);
    return yesNo;
  }
}
