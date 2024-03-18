import re

def solve1(input):
    res = 0;
    splittedInput = input.split("\n");
    for i in range(len(splittedInput)-1):
            red = max([int(x) for x in re.findall(r"(\d+)\s+red", splittedInput[i])])
            green = max([int(x) for x in re.findall(r"(\d+)\s+green", splittedInput[i])])
            blue = max([int(x) for x in re.findall(r"(\d+)\s+blue", splittedInput[i])])
            if red <= 12 and green <= 13 and blue <= 14:
                res += i +1
    return (f"part 1 solution : {res}")

def solve2(input):
    res = 0;
    splittedInput = input.split("\n");
    for i in range(len(splittedInput)-1):
            red = max([int(x) for x in re.findall(r"(\d+)\s+red", splittedInput[i])])
            green = max([int(x) for x in re.findall(r"(\d+)\s+green", splittedInput[i])])
            blue = max([int(x) for x in re.findall(r"(\d+)\s+blue", splittedInput[i])])
            res += (red * green * blue)
    return (f"part 2 solution : {res}")
