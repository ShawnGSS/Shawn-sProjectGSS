


// ATTENTION , This file is still buggy, I will have to ask the professor for help 
// How do I make EmploymentDate type Date? 



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
    public void setBirthDate(Date birthDate){this.birthDate = birthDate; }
    public void setEmploymentDate(Date employmentDate){this.employmentDate = employmentDate; }
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
    public int eMoney(Employee e){
        return getEmploymentDate() * getSalaryPerDay();
    }
}
