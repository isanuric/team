theFile="hafez.txt"
with open(theFile) as f:
    list = []
    items = f.readlines()
    for item in items:
        list.append(item)

    for i in range(len(list)):
        # if not list[i].strip() and not list[i+1].strip():
        #     list[i] = ';'
        # if "غزل" in list[i] and i < len(list) - 1:
        #     list[i+1] = ','
        print(list[i])


    #for cnt, line in enumerate(f):
    #    print("Line {}: {}".format(cnt, line.strip()))
            
        # s = line.strip().rstrip('\n').split(',')
        # s1 = s[4].split('-')
        # s2 = s1[0] + '-' + s1[1] + '-' + s1[2] + ' ' + s1[3]
        # p = s2.split('.')
        # p1 = p[0] + ':' + p[1] + ':' + p[2] + '.' + p[3]

        # r = s[0] + ',' + s[1].strip() + ',' + s[2].strip() + ',' + s[3] + ',' + p1
        # print(r)
