package src;

/**
 * @author chenhuigu
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tmpNode = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(tmpNode);
        return root;
    }
}
