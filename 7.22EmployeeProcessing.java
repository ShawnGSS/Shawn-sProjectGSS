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
        fileByteStream = new FileInputStream("C:\\Users\\123\\IdeaProjects\\GSS 7-3\\src\\input.txt");
        inFS = new Scanner(fileByteStream);

        //set values
        ArrayList<Employee> pupil = new ArrayList<Employee>();
        int t = inFS.nextInt();
        for (int p = 0; p < t; p++) {
            Employee emp = new Employee();
            Date ed = new Date();
            Date bd = new Date();
            pupil.add(emp);
            emp.setFirstName(inFS.next());
            emp.setLastName(inFS.next());
            emp.setEID(inFS.nextInt());
            //Employment date
            ed.setDay(inFS.nextInt());
            ed.setMonth(inFS.nextInt());
            ed.setYear(inFS.nextInt());
            emp.setEmploymentDate(ed);
            //Birth date
            bd.setDay(inFS.nextInt());
            bd.setMonth(inFS.nextInt());
            bd.setYear(inFS.nextInt());
            emp.setBirthDate(bd);
            emp.setSalaryPerDay(inFS.nextInt());
        }
        FileOutputStream filebytestream = null;
        PrintWriter outFS = null;
        filebytestream = new FileOutputStream("C:\\Users\\123\\IdeaProjects\\GSS 7-3\\src\\output.txt");
        outFS = new PrintWriter(filebytestream);
        int totalspending = 0;
        for (int i = 0; i < t; i++) {
            pupil.get(i).printer(outFS);
            totalspending = totalspending + pupil.get(i).eMoney();
        }
        outFS.println("Total company spending: "+ totalspending);
        outFS.flush();


        

    }
}

