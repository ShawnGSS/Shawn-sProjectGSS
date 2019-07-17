import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class studentProcessing {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        //
        double[] allGPA = new double[students.size()];
        //does everything: Get info , Find GPA, add GPA to list, Print info
        for (int i = 0; i < students.size(); ++i) {
            students.get(i).readFromKeyboard();
            students.get(i).find_GPA(students.get(i).grades);
            allGPA[i] = students.get(i).find_GPA(students.get(i).grades);
            students.get(i).print_student();
        }
       /* for (int i = 0; i < students.size(); ++i) {
            if(students.get(i).CompareStudents(students.get(i+1)) == 1){
                students.get(i).print_student();
            }else if(students.get(i).CompareStudents(students.get(i+1)) == -1){
                students.get(i + 1).print_student();
            }else{
                students.get(i + 1).print_student();
            }
        }*/
        double temp = 0;
        for (int i = 0; i < allGPA.length - 1; i++) {
            if (allGPA[i] > allGPA[i + 1]) {
                temp = allGPA[i];
                allGPA[i] = allGPA[i + 1];
                allGPA[i + 1] = temp;
                i = 0;
            }
        }
        Student tem;
        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getGPA() > students.get(i + 1).getGPA()) {
                tem = students.get(i);
                students.set(i, students.get(i + 1));
                students.set(i+1,tem);
                i = 0;
            }
        }

        System.out.println("Best GPA in class is: ");
        students.get(students.size()-1).print_student();
        System.out.println("The following are students with a GPA below average.");
        for (int i = 0; i < students.size(); ++i) {

            if (students.get(i).getGPA() < class_GPA(allGPA)) {
                students.get(i).print_student();
            }
        }

    }
        public static double class_GPA(double [] Array){
            double sum = 0;
            for(int i = 0 ; i < 3; i++ ){
                sum = sum + Array[i];
            }
            double avgGPA = sum/Array.length;
            return avgGPA;
        }
}
