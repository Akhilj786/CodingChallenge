def small_length(argv):
    if len(argv) == 0:
        return 0
    return min(len(elem) for elem in argv)


def compare(arg, i):
    prev = arg[0][i]
    for curr in arg:
        if prev != curr[i]:
            return False
        prev = curr[i]
    return True


def longestCommonPrefix(strs) -> str:
    small = small_length(strs)
    smallest = 0
    result = ""
    for i in range(0, small):
        if not (compare(strs, i)):
            return strs[0][:smallest]
        else:
            smallest += 1
            result = strs[0][:smallest]
    return result