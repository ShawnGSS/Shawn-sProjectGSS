x = int(input("enter first value: "))
y = int(input("enter second value: "))

if x < y:
        b = x
else:
        b = y
for n in range(1, b + 1):
    if (x % n == 0)and(y % n == 0):
        GDC = n


print("GCD is", GDC)