theFile="hafez.txt"
with open(theFile) as f:
    content=f.read()
    items = content.splitlines()

with open("hafez-first-parts.csv", "w") as output:
    for i in range(len(items)):
        if "غزل" in items[i] and len(items[i]) < 13 and i < len(items) - 2:
            output.write(items[i+2])
            output.write("\n")
