import sys

if __name__ == '__main__':
    with open(sys.argv[1], "r") as f:
        input = f.read()
        print("ANSWER" + input)
