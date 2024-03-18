import importlib
import sys

def main():
    day = "day" + sys.argv[1];
    fileName = day + '.txt'
    if len(sys.argv) == 3:
        fileName = "test.txt"
    input = readInput(fileName)
    currDay = importlib.import_module(day)
    print(currDay.solve1(input))
    print(currDay.solve2(input))


def readInput(fileName):
    input = "";
    with open("input/" + fileName, "r") as file:
        for line in file:
            input += line.rstrip() + "\n"
    return input


if __name__ == "__main__":
    main()