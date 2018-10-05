package PeopleLab;

public class Runner {
    public static String[] firstNames = {"Aaron", "Jessica", "Abe", "Kim", "Dylan", "Stephanie", "Adam", "Sophia", "Alan", "Olivia"};
    public static String[] familyNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Doris", "Wilson", "Math", "Ms.");
        Student students[] = new Student[30] ;
        for(int i = 0; i < 30; i++) {
            Student s1 = new Student(firstNames[(int)(Math.random() * firstNames.length) + 0], familyNames[(int)(Math.random() * firstNames.length) + 0], ((Math.random() * 4) + 1), ((int)(Math.random() * 100) + 65), ((int)(Math.random() * 100) + 65));
            students[i] = s1;
        }
        Classroom mathClass = new Classroom();
        mathClass.setTeacher(teacher);
        mathClass.setStudents(students);
        mathClass.printClass();
        System.out.println(mathClass.classAverage());
    }
}
