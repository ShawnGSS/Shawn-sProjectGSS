import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    private double GPA;
    private String name;
    private int age;
    Scanner scnr = new Scanner(System.in);
    ArrayList<Integer> grades = new ArrayList<Integer>();
    //constructor
    Student(){
        this.name = "none";
        this.age = 0;
        this.GPA = 0;
    }
    //find_GPA method
    public double find_GPA(ArrayList<Integer> grades){
        double sum = 0;
        for(int i = 0 ; i < grades.size(); i++ ){
            sum = sum + grades.get(i);
        }
        double GPA = sum/grades.size();
        setGPA(GPA);
        return GPA;
    }
    //Read from keyboard method
    public void readFromKeyboard(){
        int x;
        System.out.println("Enter name: ");
        this.name = scnr.next();
        System.out.println("Enter age: ");
        this.age = scnr.nextInt();
        System.out.println("Enter how many grades you'd like to input:  ");
        int length = scnr.nextInt();
        System.out.println("Enter the grades now: ");
        for(int i = 0; i < length; i++){
            grades.add(i);
        }
        for(int i = 0; i < length; i++){
            x = scnr.nextInt();
            this.grades.set(i,x);
        }
    }
    //print student method
    public void print_student(){
        System.out.println("Student name: "+ this.name);
        System.out.println("Student age: "+ this.age);
        System.out.println("Student grades: "+ this.grades);
        System.out.println("Student GPA: "+ this.GPA);
    }

//setter and getter
    public void setGPA(double GPA) {this.GPA = GPA;}
    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}

    public double getGPA() { return GPA; }
    public double getAge() { return age; }
    public String getName() { return name; }
}
