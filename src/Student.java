
public class Student {

    private double[] grades = new double[3];
    private int id;

    Student() {

    }

    Student(int i) {
        id = i;
    }

    double countAvg() {
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    void setGrades(double x, int y) {
        grades[y] = x;
    }

    double[] showGrades() {
        return grades;
    }

    int showId() {
        return id;
    }

}
