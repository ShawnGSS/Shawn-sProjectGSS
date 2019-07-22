class Employee:
    def __init__(self):
        self.Fname = ''
        self.Lname = ''
        self.ID = 0
        self.dur = 0
        self.spd = 0
        self.total=0
    def __str__(self):
        return str("""Employee: %s %s 
        ID: %s
        Received payment: $%s \n""" % (self.Fname,self.Lname,self.ID,self.findMoney()))
    def findMoney(self):
        return self.dur * self.spd
emplist = []
myfile = open("input.txt")
for line in myfile:
    employee = Employee()
    emplist.append(employee)
    currentline = line.split(",")
    employee.Fname = currentline[0]
    employee.Lname = currentline[1]
    employee.ID = currentline[2]
    employee.dur = int(currentline[3])
    employee.spd = int(currentline[4])
    employee.total = employee.findMoney()
myfile.close()
myfile2 = open("output.txt", 'w')
for i in range(len(emplist)):
    myfile2.write(str(emplist[i]))
myfile2.close()





