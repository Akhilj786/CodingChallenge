def strStr(haystack: str, needle: str) -> int:
    if haystack is None :
        return -1
    elif needle is None or len(needle) == 0:
        return 0
    elif len(needle) > len(haystack):
        return -1
    n = len(haystack)
    m = len(needle)
    for i in range(0, n - m + 1):
        if haystack[i] == needle[0]:
            j = 0
            k = i
            while j < m and k < n:
                if haystack[k] != needle[j]:
                    break
                j += 1
                k += 1
            if j == m:
                return i
    return -1
