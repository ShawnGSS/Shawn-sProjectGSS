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
        self.name = input("Name: ")
        self.last_name = input("last name: ")
        self.age = int(input("Age; "))
        self.ID = int(input("ID: "))
        self.GraduationDay = int(input("Day of Graduation: "))
        if self.GraduationDay > 31:
            print("invalid date")
        self.GraduationMonth = int(input("Month of Graduation: "))
        if self.GraduationMonth > 12:
            print("invald date")
        self.GraduationYear = int(input("Year of Graduation: "))
        if self.GraduationYear > 2019 or self.GraduationYear < 1800:
            print("invald date")
        length = int(input("How much grades would you like to input: "))
        for i in range(length):
            self.Grades.append(int(input("Enter grades; ")))

    def __str__(self):
        return("""Student name: %s %s 
        Student age: %s
        Student ID: %s
        Student grades: %s
        Student GPA: %s
        Student graduated on (EU format) %s / %s / %s \n""" % (self.name,self.last_name,self.age,self.ID,self.Grades, self.GPA,self.GraduationDay, self.GraduationMonth, self.GraduationYear) )


def getallstudent():
    studentlist = []
    for i in range(3):  # 3 could be a user defined number but that wasnt in the homework discription so i created 3
        Stu = Student()
        Stu.readFromKeyboard()
        Stu.find_GPA()
        studentlist.append(Stu)
    return studentlist

Listt = getallstudent()
for i in range(3):
    print(Listt[i])
