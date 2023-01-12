package src;

/**
 * @author chenhuigu
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return recur(root.left,root.right);
    }

    /**
     * 判断两棵子树是否对称
     */
    private boolean recur(TreeNode left,TreeNode right){
        // 同时超出叶子节点
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return recur(left.left,right.right) && recur(left.right,right.left);
    }
}
