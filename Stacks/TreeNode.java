import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Binary_Tree_Inorder_Traversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        TreeNode curr = root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;
    }
}