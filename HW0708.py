#A method
def a(leng):
    A = [0] * leng
    print("Input A array: ")
    for i in range(len(A)):
        A[i] = int(input())
    return A

def sum_lists(a,b,leng):
    C = [0] * leng
    absum = 0
    for i in range(len(C)):
        absum = a[i] + b[i]
        C[i] = absum
        print(C[i], end= " ")
    print(" ")
    return C
#D method
def d(C, leng, x):
    D = [0] * leng
    for i in range(len(D)):
        D[i] = C[i] * x
        print(D[i], end= " ")
    return D

# Main of the program
leng = int(input('Enter your list range: '))
a = a(leng)
b = a(leng)
c = sum_lists(a, b, leng)
d(c, leng, 10)

