def roman_to_int(s: str) -> int:
    hash = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    sum: int = 0
    global prev
    prev = 2 ** 31 - 1
    for x in range(len(s)):
        current = hash.get(s[x])

        if x == 0:
            prev = current
        elif prev < current:
            current = current - 2 * prev
            prev = current
        else:
            prev = current
        sum += current
    return sum
