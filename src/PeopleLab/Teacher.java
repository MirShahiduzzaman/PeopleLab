package PeopleLab;

/***
 * Afaq Anwar
 * Teacher object that extends off the person object.
 * Each teacher has a Title (Mr., Ms., Mrs., etc.)
 * Each teacher also has a subject.
 */

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
