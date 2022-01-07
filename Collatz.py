import sys

# It's an algorithm of calculations for Collatz conjecture:
# 1. You pass a value, when the script asks this
# 2. If value is multiple of 2, then it divide by 2, otherwise it should be multiplied by 3 and add 1.
# 3. Do it while a passed number don't equal to 1, because further it will be infinitely repeated.
# 4. You can save a result in file or decline this suggestion.

def starting():
    starting.number = input("Please enter any natural number: ")
    if (not starting.number.isdigit()) or (int(starting.number) <= 0):
        print("Please pass only natural number (this is 1,2,3,4...)")
        print("You passed the nubmer", starting.number)
        starting()
    else:
        Collatz()

def Collatz():
    Collatz.number = starting.number
    Collatz.number_result = []
    while int(Collatz.number) != 1:
        Collatz.number_result.append(Collatz.number)
        if int(Collatz.number) % 2 == 0:
            Collatz.number = int(Collatz.number)/2
        else:
            Collatz.number = (int(Collatz.number)*3)+1
    Collatz.number_result.append(Collatz.number)
    saving()

def saving():
    saving.request_results = input("Do you want to save a result? Please enter y/N: ")
    if str(saving.request_results) == "y":
        mkfile()
    elif str(saving.request_results) == "N":
        for value in Collatz.number_result:
            print(int(value))
        print("This value has been passed:", starting.number)
        print("Count of values including an initial one:", len(Collatz.number_result))
        repeating()
    else:
        print(saving.request_results, "is invalid value. Please enter <y> or <N>")
        saving()

def mkfile():
    request_filename = str(input("Do you want to specify a special filename? Please enter y/N: "))
    if str(request_filename) == "y":
        filename = str(input("Please enter name for your file: "))
        print("A file will be created with name:", filename)
        file = open("{filename}".format(filename=filename), "w")
    elif str(request_filename) == "N":
        print("A file will be created with name: {number}_Collatz".format(number=starting.number))
        file = open("{number}_Collatz".format(number=starting.number), "w")
    else:
        print(request_filename, "is invalid value. Please enter <y> or <N>")
        mkfile()

    file.write("This value has been passed: {number}\n".format(number=starting.number))
    file.write("Count of values including an initial one: {count}\n".format(count=len(Collatz.number_result)))
    for value in Collatz.number_result:
        file.write("{value}\n".format(value=int(value)))
    file.close()
    repeating()

def repeating():
    request_calc = input("Do you want to calculate else? Please enter y/N: ")
    if str(request_calc) == "y":
        starting()
    elif str(request_calc) == "N":
        sys.exit()
    else:
        print(request_calc, "is invalid value. Please enter <y> or <N>")
        repeating()

starting()
