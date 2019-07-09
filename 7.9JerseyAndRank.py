PlayerDic = {}
for i in range(0,5):
    Jersey = int(input("Enter jersey number: "))
    Rank = int(input("Enter rank number: "))
    if (Jersey > 99)or(Jersey < 0)or(Rank > 9)or(Rank < 1):
        print("Invalid number")
    else:
        PlayerDic[Jersey] = Rank
for key in sorted(PlayerDic.keys()):
    print("Player witht the jersey number %s has a rank of %s" % (key, PlayerDic[key]))






