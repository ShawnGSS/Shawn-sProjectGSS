from typing import List


class Rectangle:
    def __init__(self):
        self.length = 0
        self.width = 0

    def __str__(self):
        return """This is a rectangle with a length of %d and a width of %d. 
        It has a perimeter of %s and an area of %s """% (self.length,self.width,AP(self.length,self.width)[0],AP(self.length,self.width)[1])

    def __eq__(self, other):
        if self.length == other.length and self.width == other.width:
            return True
        return False


def AP(length,width ):
    peri = length + width *2
    area = length * width
    tup = (peri,area)
    return tup


def ans():
    stop = ''
    lis = []
    while stop != 'q':
        rec = Rectangle()
        lis.append(rec)
        flag = False
        while flag == False:
            try:
                l = int(input("Length: "))
                if l <= 0:
                    raise ValueError
                else:
                    rec.length = l
                w = int(input("Width: "))
                if w <= 0:
                    raise ValueError
                else:
                    rec.width = w
                flag = True
            except ValueError:
                print("No negative number, or zero as input")
            except:
                print("cannot calculate your input")
            print(rec)
            stop = input("enter q to stop creating rectangles, else press enter: ")
    return lis


listt = ans()
try:
    for i in range(len(listt) - 1):
        if listt[i + 1] == listt[i]:
            print("The rectangles are the same.")
        else:
            print("The rectangles are different.")
except:
    print("Something went wrong, we could'nt compare your rectangles")




