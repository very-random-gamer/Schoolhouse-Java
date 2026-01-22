public class Student {
    // design a class that practices object-oriented programming concepts

    // getName, getScore, getPerformance methods

    // instance variables: name and score
    private String name;
    private int score;

    // constructor 
    public Student(String n, int s) {
        name = n;
        score = s;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getPerformance() {
        if (score >= 90) { return "A"; }
        else if (score >= 80) { return "B"; }
        else { return "C or below"; }
    }
}