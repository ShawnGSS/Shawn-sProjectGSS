import math
a = float(input('Input a: '))
b = float(input('Input b: '))
c = float(input('Input c: '))
delta = b ** 2 - 4 * a * c

if delta == 0:
    xr = -b / (2 * a)
    print(xr)

elif delta > 0:
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    print(x1)
    print(x2)
else:
    print("There's no root.")





