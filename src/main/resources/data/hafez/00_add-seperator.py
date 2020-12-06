theFile="hafez.txt"
with open(theFile) as f:
    content=f.read()
    items = content.splitlines()

with open("hafez-seperated.csv", "w") as output:
    for i in range(len(items)):
        if not items[i].strip() and not items[i+1].strip():
            items[i] = ';'
        if "غزل" in items[i] and len(items[i]) < 13 and i < len(items) - 1:
            items[i+1] = ','
        #print(items[i])
        output.write(items[i])
        output.write("\n")



    #for cnt, line in enumerate(f):
    #    print("Line {}: {}".format(cnt, line.strip()))

        # s = line.strip().rstrip('\n').split(',')
        # s1 = s[4].split('-')
        # s2 = s1[0] + '-' + s1[1] + '-' + s1[2] + ' ' + s1[3]
        # p = s2.split('.')
        # p1 = p[0] + ':' + p[1] + ':' + p[2] + '.' + p[3]

        # r = s[0] + ',' + s[1].strip() + ',' + s[2].strip() + ',' + s[3] + ',' + p1
        # print(r)
