def is_balanced(expr: str) -> bool:
    stack = []
    stack = Deque()
    for i in expr:
        if(i == "("):
            stack.append("(")
        if(i == ")"):
            if(len(stack) == 0):
                return False
            stack.pop()

    return True if len(stack) == 0 else False

def main():
    print(is_balanced("()"))
    print(is_balanced("()()"))
    print(is_balanced(")()("))

if __name__ == "__main__":
    main()