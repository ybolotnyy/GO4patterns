package GoFpatterns.Structural.Flyweight;

public class TestFlyweight {
  public static void main(String args[]) {

    String[] names = {"Ralph", "Gomer", "Bart"};
    int[] ids = {111, 222, 333};
    int[] scores = {45, 65,75};

    double total = 0;
    for (int loopIndex = 0; loopIndex < scores.length; loopIndex++) {
        total += scores[loopIndex];
    }

    double averageScore = total / scores.length;

    Student student = new Student(averageScore);

    for (int loopIndex = 0; loopIndex < names.length; loopIndex++) {
        student.setId(ids[loopIndex]);
        student.setName(names[loopIndex]);
        student.setScore(scores[loopIndex]);

        System.out.printf("Name: %s (standing: %f)\n",
                student.getName(), student.getStanding());
    }
  }
}
