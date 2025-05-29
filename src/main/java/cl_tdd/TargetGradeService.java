package cl_tdd;

public class TargetGradeService {
    private String grade;

    public void setGrade(String grade) {
        if (!grade.matches("P|C|D|HD")) {
            throw new IllegalArgumentException("Invalid grade");
        }
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
