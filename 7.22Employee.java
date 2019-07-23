import java.io.IOException;
import java.io.PrintWriter;

public class Employee {
    private String firstName;
    private String lastName;
    private int eID;
    private Date birthDate;
    private Date employmentDate;
    private int salaryPerDay;

    public void setFirstName(String firstName){this.firstName = firstName; }
    public void setLastName(String lastName){this.lastName = lastName; }
    public void setEID(int eID){this.eID = eID; }
    public void setBirthDate(Date date){this.birthDate = date; }
    public void setEmploymentDate(Date date){this.employmentDate = date; }
    public void setSalaryPerDay(int salaryPerDay){this.salaryPerDay = salaryPerDay; }

    public String getFirstName(){return firstName; }
    public String getLastName(){return lastName; }
    public int getEID(){return eID; }
    public Date getBirthDate(){return birthDate; }
    public Date getEmploymentDate(){return employmentDate; }
    public int getSalaryPerDay(){return salaryPerDay ; }




    public String toString(Employee e){
        return String.format("Employee: %s %s \n ID: %s \nBirth date: %s Employment date %s\nSalary per day: %s", e.getFirstName(), e.getLastName(), e.getEID(), e.getBirthDate(), e.getEmploymentDate(), e.getSalaryPerDay());
    }
    public int eMoney(){
        int employmentTime = (2019 * 365 + 7*30 + 23) - (employmentDate.getDay() + employmentDate.getMonth() * 30+employmentDate.getYear() * 365);
        return employmentTime * getSalaryPerDay();
    }
    public void printer(PrintWriter outFS)throws IOException {
        outFS.println("Employee "+ this.firstName + " " + this.lastName);
        outFS.format("ID: %s, received payment so far: %s", this.eID, this.eMoney());
        outFS.println(" ");
        outFS.flush();
    }

}
