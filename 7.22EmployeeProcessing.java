//ATTENTION , WOULD NOT WORK, NEED TO ASK PROFESSOR




import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
public class EmployeeProcessing {
    public static void main(String[] args) throws IOException {

        //Input file to processor
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        fileByteStream = new FileInputStream("C:\\Users\\123\\IdeaProjects\\GSS 7-3\\src\\student_file.txt");
        inFS = new Scanner(fileByteStream);

        //Output processed info to new file
        FileOutputStream filebytestream = null;
        PrintWriter outFS = null;
        filebytestream = new FileOutputStream("C:\\Users\\123\\IdeaProjects\\GSS 7-3\\src\\student_file_printed.txt");
        outFS = new PrintWriter(filebytestream);

        //set values
        ArrayList<Employee> pupil = new ArrayList<Employee>();
        int t = inFS.nextInt();
        for (int p = 0; p < t; p++) {
            Employee emp = new Employee();
            pupil.add(emp);
            emp.setFirstName(inFS.next());
            emp.setLastName(inFS.next());
            emp.setEID(inFS.nextInt());
            emp.setBirthDate(inFS.nextDate());
            emp.setEmploymentDate(inFS.nextInt());

            outFS.println("Employee "+ emp.getFirstName() + " " + emp.getLastName());
            outFS.format("ID: %s, received payment so far: %s", emp.getEID(), emp.get);

            outFS.flush();
        }

    }
}
