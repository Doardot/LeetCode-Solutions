# Description
# Given an integer array nums, return true if any value appears at least
# twice in the array, and return false if every element is distinct.


class ContainsDuplicate:
    def __init__(self):
        nums = [1, 2, 3, 1]

        result = self.containsDuplicate(nums)

        if not result:
            print("There are no duplicates")
        else:
            print("There are duplicates!")

    def containsDuplicate(self, nums: list[int]) -> bool:
        hashset = set()

        for n in nums:
            if n in hashset:
                return True  # found a duplicate
            hashset.add(n)
        return False


ContainsDuplicate()
