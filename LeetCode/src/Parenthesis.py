from collections import deque


def setter():
    stack = deque()
    pair_parenthesis = {'{': '}', "(": ")", "[": "]"}
    return stack, pair_parenthesis


def is_valid(s: str) -> bool:
    stack, pair_parenthesis = setter()
    for c in s:
        if c in pair_parenthesis.keys():
            stack.append(c)
        elif c in pair_parenthesis.values():
            if len(stack) > 0 and pair_parenthesis[stack.pop()] == c:
                continue
            else:
                return False
        else:
            return False
    return len(stack) == 0
