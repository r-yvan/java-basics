package Starting;

class Student {
    int id;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {

//        ARRAY OF OBJECTS

        Student Ivan = new Student();
        Ivan.id = (int) (Math.random() * 10);
        Ivan.name = "Rubuto Yvan";
        Ivan.marks = (int) (Math.random() * 100);

        Student Paccy = new Student();
        Paccy.id = (int) (Math.random() * 10);
        Paccy.name = "Paccy Pank";
        Paccy.marks = (int) (Math.random() * 100);

        Student Eric = new Student();
        Eric.id = (int) (Math.random() * 10);
        Eric.name = "Eric Christian";
        Eric.marks = (int) (Math.random() * 100);

        Student students [] = new Student [3];

        students [0] = Ivan;
        students [1] = Paccy;
        students [2] = Eric;

        for (Student student : students) {
            System.out.println("| " + student.id + " | " + student.name + " | " + student.marks + " |");
        }

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.println("| " + students [i].id + " | " + students [i].name + " | " + students [i].marks + " |");
        }
    }
}
