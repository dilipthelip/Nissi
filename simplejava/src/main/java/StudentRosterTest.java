/**
 * Created by z001qgd on 6/30/17.
 */
public class StudentRosterTest {

    public static void main(String[] args) {

        Student student1 = new Student("Nissi","BIOLOGY" ,4.0);
        Student student2 = new Student("Divya","Computers" ,4.0);
        Student student3 = new Student("Yasmin","Airline" ,4.0);
        Student student4 = new Student("Aishu","Travel and Hospitality" ,4.0);

        StudentRoster studentRoster = new StudentRoster(4);
        studentRoster.addStudent(student1);
        studentRoster.addStudent(student2);
        studentRoster.addStudent(student3);
        studentRoster.addStudent(student4);

        System.out.println("Size of the Roster : " + studentRoster.rosterSize());
        System.out.println("Student is : " + studentRoster.getStudent("Nissi"));
        System.out.println("Student is : " + studentRoster.getStudent("Aishu"));



        //Double the size by adding an extra student.

        Student student5 = new Student("Dilip","Electronics" ,4.0);
        studentRoster.addStudent(student5);
        Student student6 = new Student("Ashok","Computers" ,4.0);
        studentRoster.addStudent(student6);
        System.out.println("Size of the Roster : " + studentRoster.rosterSize());
        System.out.println("Student is : " + studentRoster.getStudent("Dilip"));
    }
}
