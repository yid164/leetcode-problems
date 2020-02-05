public class Solution {

    public static int findNumbers(int[] nums) {
        int ans = 0;
        if(nums.length == 0)
        {
            return ans;
        }
        for(int n : nums)
        {
            int digit = String.valueOf(n).length();
            if(digit%2 == 0)
            {
                ans ++;
            }
        }
        return ans;
    }

    /**
     * Test
     * @param args
     */

    public static void main(String []args)
    {
        int[] number = {12,345,2,6,7896};
        System.out.println(findNumbers(number));
    }
}
