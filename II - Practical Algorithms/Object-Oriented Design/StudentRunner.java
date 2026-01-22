public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 85);
        Student s2 = new Student("Jordan", 92);
        Student s3 = new Student("Taylor", 78);

        Student[] students = {s1, s2, s3};

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i].getName() + ": " +
                students[i].getPerformance()
            );
        }
    }
}
