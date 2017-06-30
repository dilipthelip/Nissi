/**
 * Created by z001qgd on 6/30/17.
 */
public class Student {

    private String Name;
    private String Major;
    private double GPA;



    public Student(String Name, String Major, double GPA){
        this.Name = Name;
        this.Major = Major;
        this.GPA = GPA;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Major='" + Major + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
