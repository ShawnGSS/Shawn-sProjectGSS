def search(mysearch,num):
    ch = len(mysearch) - 1
    for i in range(0, len(mysearch)):
        if mysearch[i] == num:
            print(num, " was found in Array")
        else:
            ch = ch - 1
    if ch == -1:
        print("Number not found in Array")
    return

# this is an example of the function to search a number in 1,2,5,6,3,4 etc
mysearch = [1,2,5,6,3,4,77,8,9,11,10,-8]
num = (int(input("Enter a number to search that in you Array: ")))
print(search(mysearch, num))








