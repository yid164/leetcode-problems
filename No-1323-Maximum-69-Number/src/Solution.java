import java.util.Arrays;

public class Solution {
    /**
     *
     * @param num contains 6 or 9
     * @return the max number
     */
    public static int maximum69Number (int num) {
        int max = num;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        char[] char1 = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == '6')
            {
                chars[i] = '9';
            }
            else if(chars[i] == '9'){
                chars[i] = '6';
            }
            int theNum = Integer.valueOf(String.copyValueOf(chars));
            System.out.println("The number is " + theNum);
            if(theNum > max)
            {
                max = theNum;
            }
            chars = char1.clone();
        }
        return max;

    }

    public static void main(String[] args)
    {
        System.out.println(maximum69Number(9669));
    }
}
