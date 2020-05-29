def removeDuplicates(nums) -> int:
    length = len(nums)
    if length < 2:
        return length
    i = 0
    j = 1
    while j < length:
        if nums[i] != nums[j]:
            i += 1
        nums[i] = nums[j]
        j += 1
    print(nums[:i + 1])
    return i + 1


def removeElement(nums, val) -> int:
    length = len(nums)
    i = 0
    j = length-1
    while i <= j:
        if nums[i] == val:
            temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            j -= 1
        else:
            i += 1
    return j+1