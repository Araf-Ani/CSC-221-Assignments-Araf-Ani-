import java.util.*;

public class Student{
    public String name;
    public int id;
    public int marks;

    public Student(String name, int age, int marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }

    /** Returns the id of this Student */
    public int getID(){
        return id;
    }

    /** Returns the marks of this Student */
    public int getMarks(){
        return marks;
    }

    public static void main(String[] args) {
        int x = 0;
        int menuChoice = -1;
        Student[] students = new Student[30];
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\t\t\tStudent Record Menu");
            System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
            System.out.println("Enter a choice: ");
            menuChoice = input.nextInt();

            if (menuChoice == 1) {
                if (x < 30) { //Able to add new student.
                    System.out.println("Full name:");
                    String name = input.next();
                    System.out.println("ID:");
                    int id = input.nextInt();
                    System.out.println("Marks:");
                    int marks = input.nextInt();

                    //Create the new student using the given inputs
                    Student s = new Student(name, id, marks);

                    //Place in array
                    students[x] = s;

                    //Increment x for next student placement
                    x++;
                } else {  //Not able to add new student
                    System.out.println("Can't add new student, students full");
                }
            } else if (menuChoice == 2) {
                for (int i = 0; i < x; i++) {
                    Student s = students[i];
                    System.out.println(s.getName() + s.getID() + s.getMarks());
                }
            } else if (menuChoice < 1 || menuChoice > 4) {
                System.out.println("Unrecognized menu choice; please re-enter");
            }
        } while (menuChoice != 4);

        input.close();
    }
}