student = {"Kelly":{'final': 20,
                    'homework':[12,13,14]
                    },
           "David":{'final': 25,
                    'homework':[4,5,17]
                    }}
for s in student:
    avg=sum(student[s]['homework'])/3
    print(s ,student[s]['final'], avg)
