package day26;

public class Course {


    private String season;

    private String courseName;

    private double avarageScore;

    private int numberOffStudent;

    public Course() {
    }
    public Course(String season, String courseName, double avarageScore, int numberOffStudent) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOffStudent = numberOffStudent;
    }



    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(double avarageScore) {
        this.avarageScore = avarageScore;
    }

    public int getNumberOffStudent() {
        return numberOffStudent;
    }

    public void setNumberOffStudent(int numberOffStudent) {
        this.numberOffStudent = numberOffStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOffStudent=" + numberOffStudent +
                '}';
    }
}

