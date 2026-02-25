#include <vector>
#include <unordered_map>
#include <iostream>

using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &rVecNums, int iTarget)
    {
        unordered_map<int, int> uMap;
        uMap.reserve(rVecNums.size());
        for (int i = 0; i < rVecNums.size(); i++)
        {
            int iAux = iTarget - rVecNums[i];
            auto iFound = uMap.find(iAux);
            if (iFound != uMap.cend())
            {
                return {iFound->second, i};
            }
            uMap.emplace(rVecNums[i], i);
        }

        return {};
    }
};

int main()
{
    Solution solution;
    vector<int> vecNums = {1, 2, 3, 4, 5};
    int iTarget = 6;

    vector<int> vecResult = solution.twoSum(vecNums, iTarget);

    if (!vecResult.empty())
    {
        std::cout << "Indices: " << vecResult[0] << ", " << vecResult[1] << std::endl;
    }
    else
    {
        std::cout << "No two sum solution" << std::endl;
    }

    return 0;
}