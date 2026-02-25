# Description
# You are given an array prices where prices[i] is the price of a given stock on the ith day.

# You want to maximize your profit by choosing a single day to buy one stock
# and choosing a different day in the future to sell that stock.

# Return the maximum profit you can achieve from this transaction.
# If you cannot achieve any profit, return 0.


class BestTimeToBuy:
    def __init__(self):
        prices = [7, 1, 5, 3, 6, 4]

        result = self.maxProfit(prices)

        print(result)

    def maxProfit(self, prices: list[int]) -> int:
        left, right = 0, 1  # buy, sell
        maxP = 0  # max profit

        while right < len(prices):
            # checks if its profitable
            if prices[left] < prices[right]:
                profit = prices[right] - prices[left]
                maxP = max(maxP, profit)
            else:
                left = right
                # this will skip all the numbers between left and right
                # and go straight to right
            right += 1
        return maxP


BestTimeToBuy()
