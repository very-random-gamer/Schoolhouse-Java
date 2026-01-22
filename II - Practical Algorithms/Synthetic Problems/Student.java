public class Student {
    private String name;
    private int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    // TODO: calculate and return average score
    public double getAverage() {
        return 0.0;
    }

    // TODO: return performance string based on average
    public String getPerformance() {
        return "";
    }

    // TODO: return highest score
    public int getHighScore() {
        return 0;
    }

    // TODO: return the "all-star" student (student with the highest average)
    public String getHonorRoll() {
        return "";
    }
}
