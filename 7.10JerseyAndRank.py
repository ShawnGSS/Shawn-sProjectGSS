
def A(user):
    if user == 'a':
        length = 0
        Jersey = int(input("Enter jersey number: "))
        Rank = int(input("Enter rank number: "))
        if (Jersey > 99) or (Jersey < 0) or (Rank > 9) or (Rank < 1):
            print("Invalid number")
        else:
            PlayerDic[Jersey] = Rank
            length += 1
def D(user):
    if user == 'd':
        Jersey = int(input("Enter player jersey you'd like to delete: "))
        if Jersey in PlayerDic:
            del PlayerDic[Jersey]
        else:
            print("Player doesnt exist")
def U(user):
    if user == 'u':
        Jersey = int(input("Enter jersey number: "))
        if Jersey in PlayerDic:
            PlayerDic[Jersey] = input("Enter new rank number: ")
        else:
            print("Player doesnt exist")

    # elif user == 'r':
    # i dont know how to do R...
def O(user):
    if user == 'o':
        for key in sorted(PlayerDic.keys()):
            print("Player with the jersey number %s has a rank of %s" % (key, PlayerDic[key]))
PlayerDic = {}

user = " "
while user != 'q':
    print("""    a - Add player
    d - Remove player
    u - Update player rating
    r - Output player above rating
    o - Output roster
    q - Quit
    enter your option: 
    """)
    user = input()
    print(A(user),D(user),U(user),O(user))

print("End of Program.")



















