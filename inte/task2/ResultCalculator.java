package inte.task2;

public class ResultCalculator {
    private int total;
    private float percentage;
    private String grade;

    public void calculate(Subject[] subjects) {
        total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }
        percentage = (float) total / subjects.length;

        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80)
            grade = "B";
        else if (percentage >= 70)
            grade = "C";
        else if (percentage >= 60)
            grade = "D";
        else if (percentage >= 40)
            grade = "E";
        else
            grade = "F";
    }

    public int getTotal() {
        return total;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getGrade() {
        return grade;
    }
}
