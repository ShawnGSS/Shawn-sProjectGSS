Grade = int(input("Please enter your grade: "))
if Grade <= 60:
    print("You have an F")
elif 61 <= Grade < 71:
    print("You have a D")
elif 71 <= Grade < 81:
    print("You have a C")
elif 81 <= Grade < 91:
    print("You have a B")
elif 91 <= Grade < 101:
    print("You have a A")
else:
    print("Please enter a valid grade.")
