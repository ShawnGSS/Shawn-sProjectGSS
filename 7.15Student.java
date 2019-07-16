import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    private double GPA;
    private String name;
    private int age;
    private int GraduationDay;
    private int GraduationMonth;
    private int GraduationYear;
    private int GraduationSum;


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
        System.out.println("Enter Graduation Day, Month and Year: ");
        this.GraduationDay = scnr.nextInt();
        if(this.GraduationDay > 31){
            System.out.print("invalid day");
        }
        this.GraduationMonth = scnr.nextInt();
        if(this.GraduationMonth > 12){
            System.out.print("invalid month");
        }
        this.GraduationYear = scnr.nextInt();
        if(this.GraduationYear > 2017){
            System.out.print("invalid year");
        }
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
    public int CompareStudents(Student o){
        this.GraduationSum = this.GraduationDay + this.GraduationMonth * 30 + this.GraduationYear * 365;
        int Osum = o.getGraduationDay() + o.getGraduationMonth() * 30 + o.getGraduationYear() * 365;
        if(this.GraduationSum == Osum){
            return 0;
        }else if (this.GraduationSum < Osum){
            return -1;
        }else{
            return 1;
        }


    }


//setter and getter
    public void setGPA(double GPA) {this.GPA = GPA;}
    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}
    public void setGraduationDay(int GraduationDay) {this.GraduationDay = GraduationDay;}
    public void setGraduationMonth(int GraduationMonth) {this.GraduationMonth = GraduationMonth;}
    public void setGraduationYear(int GraduationYear) {this.GraduationYear = GraduationYear;}
    public void setGraduationSum(int GraduationSum) {this.GraduationSum = GraduationSum;}

    public double getGPA() { return GPA; }
    public double getAge() { return age; }
    public String getName() { return name; }
    public int getGraduationDay() { return GraduationDay; }
    public int getGraduationMonth() { return GraduationMonth; }
    public int getGraduationYear() { return GraduationYear; }
    public int getGraduationSum() { return GraduationSum; }
}

