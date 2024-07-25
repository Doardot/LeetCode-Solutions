import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 6;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int aux = target - nums[i];
            if (map.containsKey(aux)) {
                return new int[] { map.get(aux), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
