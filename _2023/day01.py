import re

def solve1(input):
    res = 0;
    arrOfNumber = []
    for line in input.split("\n"):
        if(line != ""):
            arrOfNumber = re.findall(r"\d", line)
            firstNumber = arrOfNumber[0]
            lastNumber = arrOfNumber[-1]
            res += int(firstNumber + lastNumber)                         
        
    return (f"part 1 solution : {res}")

def solve2(input):
    res = 0;

    numbersInLetters = ['one','two','three','four','five','six','seven','eight','nine'];
    for line in input.split("\n"):
        if(line != ""):
            print(f"line:{line}")
            minIndex = -1
            firstNumberFound = -1
            while(minIndex < 100):
                minIndex = 100
                for i in range(len(numbersInLetters)):
                   print(f"i:{i}")
                   print(numbersInLetters[i])
                   currIndex = line.find(numbersInLetters[i])
                   print(f"currIndex:{currIndex}")
                   if currIndex > -1 and currIndex < minIndex:
                      minIndex = currIndex
                      firstNumberFound = i
                      print(firstNumberFound)
                if firstNumberFound > -1 and minIndex < 100:
                    s = numbersInLetters[firstNumberFound]
                    print(s)
                    currLine = line.replace(s, s[0]+(firstNumberFound+1)+s[-1])
            
            arrOfNumber = re.findall(r"\d", line)
            firstNumber = arrOfNumber[0]
            lastNumber = arrOfNumber[-1]
            print(firstNumber,lastNumber, res)
            res += int(firstNumber + lastNumber)
    return (f"part 2 solution : {res}")   

            
           

            

#   var minIndex = -1;
#   var currIndex = -1;
#   // while (minIndex < 100) {
#   minIndex = 1;    
#   var firstNumberFound: number = -1;
#   // console.log("currLine: " +currLine);
#   while(minIndex < 100){
#     minIndex = 100;
#     for (let i = 0; i < numbersInLetters.length; i++) {
#       let currIndex: number = currLine.indexOf(numbersInLetters[i]);      
#             if (currIndex > -1 && currIndex < minIndex) {
#               minIndex = currIndex;
#               firstNumberFound = i;              
#             }
#     }   if (firstNumberFound > -1 && minIndex < 100){
#     let s : string = numbersInLetters[firstNumberFound];
#     currLine = currLine.replace(s, (s.charAt(0)+(firstNumberFound+1)+s.charAt(s.length-1)).toString());
#     //console.log("minIndex:" + minIndex + " currIndex:" + currIndex + " firstNumberFound:" + firstNumberFound + ' replacedLine: ' + currLine);
#           }
#         } 


#         var arrOfNumber : string = currLine.match(REGEX)!.toString().replace(",", "");
#         var first : string = arrOfNumber.slice(0,1).toString();
#     var last : string = arrOfNumber.slice(arrOfNumber.length-1, arrOfNumber.length).toString();
#  var completeNumber: number = parseInt(first + last);
#  total += completeNumber;
#  console.log("String: " + currLine + " arrOfNumber:" + arrOfNumber + " " + first + " & " + last + " => " + completeNumber + " (total = " + total + ")");

# });

 
#  console.log("TOTAL: " + total);
 




    