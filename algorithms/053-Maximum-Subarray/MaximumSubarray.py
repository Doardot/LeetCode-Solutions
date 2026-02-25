# Description
# Given an integer array nums, find the subarray
# with the largest sum, and return its sum.
class MaximumSubarray:
    def __init__(self):
        nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        result = self.maxSubArray(nums)
        print(result)

    def maxSubArray(self, nums: list[int]) -> int:
        maxSub = nums[0]
        curMax = 0

        for n in nums:
            curMax = max(n, curMax + n)
            # if curMax + n (adding the current value to the accumulated sum)
            # is greater than n (the current value alone),
            # the algorithm continues with the accumulated sum.
            # Otherwise, it "resets" the subarray and starts from the current value.
            maxSub = max(maxSub, curMax)
        return maxSub


MaximumSubarray()
