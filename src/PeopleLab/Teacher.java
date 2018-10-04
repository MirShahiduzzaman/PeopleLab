package PeopleLab;

public class Teacher extends Person {
    private String Subject;
    private String Title;

    public Teacher(String firstName, String familyName, String Subject, String Title) {
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }

    public String getSubject() {
        return Subject;
    }

    @Override
    public String toString() {
        return Title + getFamilyName();
    }
}
