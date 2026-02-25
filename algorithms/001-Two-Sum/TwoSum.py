## Description
# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.


class TwoSum:
    def __init__(self):
        nums = [2, 7, 11, 15]
        target = 9

        result = self.twoSum(nums, target)

        if result is not None:
            print("Indices: " + str(result[0]) + ", " + str(result[1]))
        else:
            print("No two sum solution")

    def twoSum(self, nums: list[int], target: int) -> list[int]:
        hashMap = {}  # val : index

        for i, n in enumerate(nums):
            diff = target - n
            if diff in hashMap:
                return [hashMap[diff], i]  # {map.get(diff), i};
            hashMap[n] = i  # map.put(nums[i], i);
        return None


TwoSum()
