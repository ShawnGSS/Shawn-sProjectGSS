def sort(Myarray):
    temp = 0
    u = -1
    while u <= len(Myarray):
        u += 1
        for i in range(0, len(Myarray) - 1):
            if Myarray[i] > Myarray[i + 1]:
                temp = Myarray[i]
                Myarray[i] = Myarray[i + 1]
                Myarray[i + 1] = temp


    return Myarray
# this is an example of the function to sort the array; 1,2,5,6,3,4 etc
Myarray = [1,2,5,6,3,4,77,8,9,11,10,-8]
print(sort(Myarray))





























