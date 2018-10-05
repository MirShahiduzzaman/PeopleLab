package PeopleLab;

public class Classroom
{
    private Student[] students;
    private Teacher teacher;
    public void Classroom(Student[] students, Teacher teacher)
    {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject()
    {
        return teacher.getSubject();
    }

    public double classAverage()
    {
        double totalAvg = 0;
        int n = 0;
        for(int i = 0; i <= students.length; i++)
        {
            totalAvg += students[i].getGPA();
            n = i;
        }
        totalAvg = totalAvg / n;
        return totalAvg;
    }

    public String printClass()
    {
        System.out.println(teacher);
        System.out.println(teacher.getSubject());
        System.out.println(students);
    }
}
