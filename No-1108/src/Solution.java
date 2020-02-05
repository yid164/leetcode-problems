import java.util.Arrays;

public class Solution {
    public static String defangIPaddr(String address)
    {
        StringBuilder ans = new StringBuilder();
        if(address.length() == 0)
        {
            return ans.toString();
        }
        String [] list = address.split("\\.");
        //System.out.println(Arrays.toString(list));
        for(int i = 0; i < list.length ; i++)
        {
            ans.append(list[i]);
            if(i < list.length - 1)
            {
                ans.append("[.]");
            }

        }
        return ans.toString();
    }

    public static void main(String [] args)
    {
        System.out.println(defangIPaddr("192.168.0.1"));
    }
}
