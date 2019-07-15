class Triangle:
    def __init__(self):
        self.side1 = 0
        self.side2 = 0
        self.side3 = 0

    def read_triangle(self):
        self.side1 = input("Input side 1: ")
        self.side2 = input("Input side 2: ")
        self.side3 = input("Input side 3: ")

    def confirm(self):
        if self.side1+self.side2>self.side3 and self.side1+self.side3>self.side2 and self.side2+self.side3>self.side1:
            print("Valid triangle")
        else:
            print("Invalid triangle")


