def max_sub_array(nums) -> int:
    if len(nums) < 1:
        return -1
    result = nums[0]
    add = nums[0]
    for i in range(1, len(nums)):
        add = max([nums[i], add + nums[i]])
        result = max([add, result])
    return result


def max_sub_array_optimized(nums) -> (int, int):
    if len(nums) < 1:
        return -1, -1
    result = nums[0]
    add = nums[0]
    start = 0
    end = 0
    for i in range(1, len(nums)):
        add += nums[i]
        if add < nums[i]:
            add = nums[i]
            start = i
        if result < add:
            result = add
            end = i

    return start, end


def max_sub_array_recursive(nums, index, res, add) -> int:
    if index == len(nums) - 1:
        return res
    add = max([nums[index], add + nums[index]])
    res = max([add, res])
    return max_sub_array_recursive(nums, index + 1, res, add)


def max_sub_array_dp(nums):
    if len(nums) < 1:
        return -1
    return max_sub_array_recursive(nums, 0, nums[0], nums[0])
