class Student:
    def __init__(self):
        self.GPA = 0.0
        self.name = "none"
        self.age = 0
        self.GraduationDay = 0
        self.GraduationMonth = 0
        self.GraduationYear = 0
        self.GraduationSum = 0
        self.Grades = []

    #find_GPA method
    def find_GPA(self):
        self.GPA = sum(self.Grades)/len(self.Grades)
    #Read from keyboard method
    def readFromKeyboard(self):
        self.name = input("Name: ")
        self.age = int(input("Age; "))
        self.GraduationDay = int(input("Day of Graduation: "))
        self.GraduationMonth = int(input("Month of Graduation: "))
        self.GraduationYear = int(input("Year of Graduation: "))
        length = int(input("How much grades would you like to input: "))
        for i in range(length):
            self.Grades.append(int(input("Enter grades; ")))
    #print student method
    def print_student(self):
        print("Student name: "+ self.name)
        print("Student age: ", self.age)
        print("Student grades: ", self.Grades)
        print("Student GPA: ", self.GPA)
        print("Student graduated on (EU date format) %s / %s / %s " % (self.GraduationDay,self.GraduationMonth, self.GraduationYear))

S1 = Student()
S1.readFromKeyboard()
S1.find_GPA()
S1.print_student()
