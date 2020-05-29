MAX_VALUE = 2**31-1
MIN_VALUE = -2**31


def reverse(x: int) -> int:
    is_negative = False
    if x < 0:
        is_negative = True
        x = x * -1
    y = 0
    while x > 0:
        rem = x % 10
        y = y * 10 + rem
        x = x // 10

    if is_negative:
        y = y * -1

    if y <= MIN_VALUE or y >= MAX_VALUE:
        return 0
    else:
        return y
