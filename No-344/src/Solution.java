import java.util.Arrays;

public class Solution {
    public static void reverseString(char[] s) {
        char[] ans = new char[s.length];
        if(s.length <= 1)
        {
            s = ans;
        }
        int count = 0;
        for(int i = s.length-1; i >= 0; i--)
        {
            ans[count] = s[i];

            count++;
        }
        for(int i = 0; i < s.length; i++)
        {
            s[i] = ans[i];
        }
    }

    public static void main(String [] args)
    {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }
}
