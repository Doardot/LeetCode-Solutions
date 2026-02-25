first thought

n = 3
[0, 1, 3]

0 + 1 = 1
1 + 2 = 3
2 + 3 = 5

prev + next

i[0] + i[1] = i[2]

============

second thought

n = 3
[0, 1, 3]

sort()

0 + 1 = 1
1 + 1 = 2
2 + 1 = 3

if (nums[i] + 1 != nums[i+1])
    return i+1

n = 2
[0, 1]

- in this case if (nums[i] + 1 != nums[i+1]) will explode
- since nums[i+1] > nums.size()
- so we must return nums.back() + 1

============

third thought

- actually an easier way without additional calc is by just checking the current index
- if ((nums[i]) != i) then return i;

- also it works when 0 is not included in the vector, which should have broken in the algo I wrote before

============

conclusion

- after finishing, I learned that the best solution here is actually using Gauss formula
- since std::sort is (O n log n)