def split_search(list: list, left, right, search):
    if left <= right:
        mid = (left + right) // 2
        if list[mid] == search:
            return mid
        elif list[mid] < search:
            return split_search(list, mid + 1, right, search)
        elif list[mid] > search:
            return split_search(list, left, mid - 1, search)
    return -1


def split_insert_search(list: list, left, right, search):
    mid = (left + right) // 2
    if left < right:
        mid = (left + right) // 2
        if list[mid] == search:
            return mid
        elif list[mid] < search:
            return split_insert_search(list, mid + 1, right, search)
        elif list[mid] > search:
            return split_insert_search(list, left, mid, search)
    return mid


# https://leetcode.com/problems/search-insert-position/
def searchInsert(nums, target: int) -> int:
    return split_insert_search(nums, 0, len(nums), target)


def binary_search(l: list, search) -> int:
    return split_search(l, 0, len(l) - 1, search)
