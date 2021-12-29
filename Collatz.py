import sys

print("""
    This is an algorithm of calculations:
    1. You give an argument with script in a command line
        e.g. in my case this is "python Collatz.py <rational number>"
    2. If argument is multiple of 2, then it divide by 2, otherwise it should be multiplied by 3 and add 1.
    3. Do it while an i don't equal to a certain value.
""")

def Collatz(i):
    i_map = []
    while i != 0:
        if int(i) % 2 == 0:
            print(int(i))
            i = int(i)/2
        else:
            if int(i) == 1:          # such as this algorithm once gives the same third of values
                print(int(i))
                i_map.append(i)
                i = (int(i)*3)+1
                if len(i_map) == 10:
                    break
            else:
                print(int(i))
                i = (int(i)*3)+1

i = sys.argv[1]
print("Argument has been passed: ", i)
Collatz(i)

