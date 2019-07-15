class Triangle:

    def __init__(self):
        self.side1 = 0
        self.side2 = 0
        self.side3 = 0

    def read_triangle(self):
        self.side1 = int(input("Input side 1: "))
        self.side2 = int(input("Input side 2: "))
        self.side3 = int(input("Input side 3: "))

    def confirm(self):
        if self.side1+self.side2>self.side3 and self.side1+self.side3>self.side2 and self.side2+self.side3>self.side1:
            print("Valid triangle")
            self.perimeter()
        else:
            print("Invalid triangle")
    def perimeter(self):
        per = self.side1 + self.side2 + self.side3
        print(per)

T1 = Triangle()
T1.read_triangle()
T1.confirm()
