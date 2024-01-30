package arrayList;
import java.util.ArrayList;

public class removeLowGPAStudents {


    public static ArrayList<Student> removeLowGPAStudents(ArrayList<Student> students) {
        double averageGPA=calculateAverageGPA(students);
        students.removeIf(student -> student.GPA < averageGPA);
        return students;
    }

    public static double calculateAverageGPA(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }


}
