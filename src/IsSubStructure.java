package src;

/**
 * @author chenhuigu
 */
public class IsSubStructure {
    /**
     * 判断B是否为A的子结构
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return recur(A, B) || isSubStructure(A.right, B) || isSubStructure(A.left, B);
    }

    /**
     * 判断B是否为A的子结构,且A.val == B.val;
     */
    private boolean recur(TreeNode A, TreeNode B) {
        if(B == null){
            return true;
        }
        if(A == null || A.val != B.val){
            return false;
        }
        return recur(A.right,B.right) && recur(A.left,B.left);
    }
}
