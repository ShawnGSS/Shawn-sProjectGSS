
def A(user):
    if user == 'a':
        Jersey = int(input("Enter jersey number: "))
        Rank = int(input("Enter rank number: "))
        if (Jersey > 99) or (Jersey < 0) or (Rank > 9) or (Rank < 1):
            print("Invalid number")
        else:
            PlayerDic[Jersey] = Rank
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
def R(user):
    if user == 'r':
        i = int(input("Enter jersey number: "))
        
        for k in PlayerDic:
            if PlayerDic[k] > i:
                filtered[k] = PlayerDic[k]
    for key in sorted(filtered.keys()):
        print("Rank filtered: jersey number %s has a rank of %s" % (key,filtered[key]))


def O(user):
    if user == 'o':
        for key in sorted(PlayerDic.keys()):
            print("Player with the jersey number %s has a rank of %s" % (key, PlayerDic[key]))
PlayerDic = {}
filtered ={}
user = " "
for i in range(5):
    Jersey = int(input("Enter jersey number: "))
    Rank = int(input("Enter rank number: "))
    if (Jersey > 99) or (Jersey < 0) or (Rank > 9) or (Rank < 1):
        print("Invalid number")
    else:
        PlayerDic[Jersey] = Rank
        
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
    print(A(user),D(user),U(user),O(user),R(user))

print("End of Program.")



































