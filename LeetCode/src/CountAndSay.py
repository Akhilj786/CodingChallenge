def count_and_say(n: int) -> str:
    i = 0
    if n <= 0:
        return ""
    elif n < 2:
        return "1"
    new_res = "1"
    while i < n-1:
        prev = new_res[0]
        count = 1
        res = ""
        for j, curr in enumerate(new_res[1:]):
            if int(prev) == int(curr):
                count += 1
                if j == len(new_res) - 1:
                    res += str(count) + "" + curr
            else:
                res += str(count) + "" + prev
                count = 1
            prev = curr
        if count >= 1:
            res += str(count) + "" + prev
        new_res = res
        i += 1
    return new_res
