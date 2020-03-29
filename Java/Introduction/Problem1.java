class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Problem1 {
    public static void main(String args[]) {
        TreeNode temp = new TreeNode(5);
        System.out.println(temp.val);
    }
}
