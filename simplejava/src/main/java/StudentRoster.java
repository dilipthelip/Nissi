import java.util.Arrays;

/**
 * Created by z001qgd on 6/30/17.
 */
public class StudentRoster {

    private Student[] studentArray;

    private int arraySize;

    @Override
    public String toString() {
        return "StudentRoster{" +
                "studentArray=" + Arrays.toString(studentArray) +
                ", arraySize=" + arraySize +
                '}';
    }

    public StudentRoster(int size){

        studentArray = new Student[size];


    }

    public void addStudent(Student newStudent){

        if(arraySize == studentArray.length){

            Student[] tempStudentArray = new Student[arraySize*2];

            for (int i = 0; i < studentArray.length; i++){
                tempStudentArray[i] = studentArray[i];
            }
            studentArray = tempStudentArray;

            for(int i=0;i<studentArray.length;i++){

                Student student = studentArray[i];
                if(student==null){
                    this.studentArray[i] = newStudent;
                    arraySize = arraySize+1;
                    break;
                }
            }

        }else{
            for(int i=0;i<studentArray.length;i++){

                Student student = studentArray[i];
                if(student==null){
                    this.studentArray[i] = newStudent;
                    arraySize = arraySize+1;
                    break;
                }
            }
        }
    }


    public Student getStudent(String name){

        Student searchedStudent=null;

        for (Student student : studentArray){

            if(student!=null) {
                if (student.getName().equals(name)) {
                    searchedStudent = student;
                }
            }
        }

        return searchedStudent;
    }

    public int rosterSize(){

        return arraySize;

    }

}
