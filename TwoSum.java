import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args)
    {
        Solution1 s = new Solution1();
        System.out.println(s.twoSum( new int[]{5,3,5,3}, 8));

    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap();

        for (int i =0; i < nums.length; i++)
        {
            if (hm.containsKey(target - nums[i]))
                return new int[]{i, hm.get(target - nums[i])};
            else
                hm.put(nums[i], i);
        }

        return new int[]{-1,-1};

    }
}