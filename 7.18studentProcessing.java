import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
public class studentProcessing {
    public static void main(String[] args) throws IOException {
        //Student list
        ArrayList<Student> students = new ArrayList<Student>();


        int amount;

        //The input file system
        FileInputStream fileByteStream = null;
        Scanner inFS = null;


        //Reading the file
        fileByteStream = new FileInputStream("C:\\Users\\123\\IdeaProjects\\GSS 7-3\\src\\student_file.txt");
        inFS = new Scanner(fileByteStream);

        //How may Students there are , user defined
        amount = inFS.nextInt();
        double[] allGPA = new double[amount];

        //does everything: Get info , Find GPA, add GPA to list, Print info
        for (int i = 0; i < amount; ++i) {
            Student Stu = new Student();
            students.add(Stu);
            Stu.setName(inFS.next());
            Stu.setAge(inFS.nextInt());
            int length = inFS.nextInt();
            for (int x = 0; x < length; ++x) {
                Stu.grades.add(x,inFS.nextInt());
            }
            Stu.setGraduationDay(inFS.nextInt());
            Stu.setGraduationMonth(inFS.nextInt());
            Stu.setGraduationYear(inFS.nextInt());

            students.get(i).find_GPA(students.get(i).grades);
            allGPA[i] = students.get(i).find_GPA(students.get(i).grades);
            students.get(i).print_student();
        }
        fileByteStream.close();
       /* for (int i = 0; i < students.size(); ++i) {
            if(students.get(i).CompareStudents(students.get(i+1)) == 1){
                students.get(i).print_student();
            }else if(students.get(i).CompareStudents(students.get(i+1)) == -1){
                students.get(i + 1).print_student();
            }else{
                students.get(i + 1).print_student();
            }
        }*/

// the following are methods in the file studentProcessing instead of Student, I wasn't sure as it war not specified in the question
// this one's not a method , i dont know its name
        Student tem;
        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getGPA() > students.get(i + 1).getGPA()) {
                tem = students.get(i);
                students.set(i, students.get(i + 1));
                students.set(i+1,tem);
                i = 0;
            }
        }
        System.out.println("  ");
        System.out.println("Best GPA in class is: ");
        students.get(students.size()-1).print_student();
        System.out.println("  ");
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

