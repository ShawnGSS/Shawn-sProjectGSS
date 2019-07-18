import time
class Student:
    def __init__(self):
        self.GPA = 0.0
        self.name = "none"
        self.last_name = "none"
        self.ID = 0
        self.age = 0
        self.GraduationDay = 0
        self.GraduationMonth = 0
        self.GraduationYear = 0
        self.GraduationSum = 0
        self.Grades = []
    def __lt__(self,other):
        if self.GPA < other.GPA:
            return True
        return False
    def __gt__(self, other):
        if self.GPA > other.GPA:
            return True
        return False
    def __eq__(self,other):
        if self.name == other.name and self.last_name == other.last_name and self.ID == other.ID:
            return True
        return False
#find_GPA method
    def find_GPA(self):
        self.GPA = sum(self.Grades)/len(self.Grades)

    #Read from keyboard method
    def readFromKeyboard(self):
        retry = "yes";
        while retry == "yes":
            try:
                self.name = input("Name: ")
                self.last_name = input("last name: ")
                self.age = int(input("Age; "))
                self.ID = int(input("ID: "))

                self.GraduationDay = int(input("Day of Graduation: "))
                if self.GraduationDay > 31:
                    print("invalid date")
                    continue
                self.GraduationMonth = int(input("Month of Graduation: "))
                if self.GraduationMonth > 12:
                    print("invald date")
                    continue
                self.GraduationYear = int(input("Year of Graduation: "))
                if self.GraduationYear > 2019 or self.GraduationYear < 1800:
                    print("invald date")
                    continue
                length = int(input("How much grades would you like to input: "))
                for i in range(length):
                    self.Grades.append(int(input("Enter grades; ")))
                retry = "no"
            except:
                print("False information ,Im gonna have to crash your system sorry , ")
                time.sleep(2)
                print("crashing...")
                for i in range(3):
                    time.sleep(0.56)
                    print("....")
                input("Just kidding, try again.\n")
                retry = "yes"
                # dont = eat = my = bratwurst


    def __str__(self):
        return("""Student name: %s %s 
        Student age: %s
        Student ID: %s
        Student grades: %s
        Student GPA: %s
        Student graduated on (EU format) %s / %s / %s \n""" % (self.name,self.last_name,self.age,self.ID,self.Grades, self.GPA,self.GraduationDay, self.GraduationMonth, self.GraduationYear) )


def getallstudent():
    studentlist = []
    m = int(input("Enter how many students there are: "))

    for i in range(m):
        retry = "yes"
        while retry == "yes":
            Stu = Student()
            Stu.readFromKeyboard()
            Stu.find_GPA()
            retry = "no"
            flag = True
            for x in studentlist:
                if (x == Stu):
                    print("Redundant Student information.")
                    flag = False
                    retry = "yes"
            if (flag == True):
                studentlist.append(Stu)
                retry = "no"
    return studentlist

Listt = getallstudent()
for i in range(len(Listt)):
    print(Listt[i])
