package PeopleLab;

public class Classroom
{
    private Person[] students;
    private Person teacher;
    public void Classroom(Person[] students, Person teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject()
    {
        return subject;
    }

    public double classAverage()
    {
        for(int i=0; i <= students.length(); i++)
        {
            
        }
    }

    public String printClass()
    {
        System.out.println(teacher);
        System.out.println(subject);
        System.out.println();
    }
}
