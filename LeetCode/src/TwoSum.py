
def two_sum(arr, target):
    d = {}
    l = []
    for elem in enumerate(arr):
        i = elem[0]
        j = elem[1]
        diff = target - j
        if j in d:
            l.append(d[j])
            l.append(i)
        d[diff] = i
    return l

