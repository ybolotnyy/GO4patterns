package GoFpatterns.Structural.Flyweight;

public class Student {
   String name;
    int id;
    int score;
    double averageScore;

    public Student(double averageScore){
        this.averageScore = averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public double getStanding() {
        return (((double) score) / averageScore -1) * 100;
    }
}
