package PeopleLab;

/***
 * Runner class to test out all of the objects.
 * A student array is created, along with a single teacher object.
 * Overall GPA is printed with each student.
 * Class average is also outputted.
 */

public class Runner {
    public static String[] firstNames = {"Aaron", "Jessica", "Abe", "Kim", "Dylan", "Stephanie", "Adam", "Sophia", "Alan", "Olivia"};
    public static String[] familyNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};


    public static Student randomStudent() {
        Student randomStudent = new Student(firstNames[(int)(Math.random() * firstNames.length)], familyNames[(int)(Math.random() * firstNames.length)], ((Math.random() * 4) + 1), ((int)(Math.random() * (35)) + 65), ((int)(Math.random() * (35)) + 65));
        return randomStudent;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Doris", "Wilson", "Math", "Ms.");
        Student students[] = new Student[30] ;
        for(int i = 0; i < 30; i++) {
            Student s1 = randomStudent();
            students[i] = s1;
        }
        Classroom classroom = new Classroom();
        classroom.setTeacher(teacher);
        classroom.setStudents(students);
        classroom.printClass();
        System.out.println(classroom.getSubject() + " Class Average: " + classroom.classAverage());
    }
}
