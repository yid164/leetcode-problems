public class Solution {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int rangeSumBST(TreeNode root, int L, int R)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.val < L)
        {
            return rangeSumBST(root.right, L, R);
        }
        else if(root.val > R)
        {
            return rangeSumBST(root.left, L, R);
        }else{
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right,L,R);
        }
    }

    public static void main(String[] args)
    {
        // example is [10,5,15,3,7,null,18], L = 7, R = 15
        // except ans = 32
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(15);

    }


}
