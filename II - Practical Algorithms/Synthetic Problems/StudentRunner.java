public class StudentRunner {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alex", new int[]{85, 90, 88}),
            new Student("Jordan", new int[]{95, 92, 93}),
            new Student("Taylor", new int[]{70, 72, 68})
        };

        for (Student s : students) {
            System.out.println(
                s.getName() + " | Avg: " +
                Math.round(s.getAverage() * 100.0) / 100.0 +
                " | " + s.getPerformance()
            );
        }

        students.getHighScore();
        
        students.getHonorRoll();
        
    }
}
