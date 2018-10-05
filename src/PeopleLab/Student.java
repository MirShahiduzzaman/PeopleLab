package PeopleLab;

public abstract class Student extends Person
{
    private double GPA;
    private double mathScore;
    private double elaScore;


    public Student(String firstName, String familyName, double GPA, double mathScore, double elaScore)
    {
        super(firstName,familyName);

        this.GPA = GPA;
        this.mathScore = mathScore;
        this.elaScore = elaScore;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getElaScore() {
        return elaScore;
    }

    public void setElaScore(double elaScore) {
        this.elaScore = elaScore;
    }

    public String toString()
    {
        return(getFamilyName() + ", " + getFirstName());
    }
}