import sys

if __name__ == '__main__':
    with open(sys.argv[1], "r") as f:
        value = f.read()
        print("ANSWER" + value)
