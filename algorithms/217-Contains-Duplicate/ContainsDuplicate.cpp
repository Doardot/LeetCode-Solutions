#include <vector>
#include <unordered_set>
#include <iostream>

using namespace std;

/*
Description
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        unordered_set<int> uSet;
        for (int num : nums)
        {
            if (!uSet.insert(num).second)
            {
                return true;
            }
        }
        return false;
    };
};

int main()
{
    Solution solution;
    vector<int> vecNums = {1, 2, 3, 1};

    bool bSolution = solution.containsDuplicate(vecNums);
    if (bSolution)
    {
        printf("Duplicated found!");
    }
    else
    {
        printf("No duplicates there!");
    }

    return 0;
}