package src;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


/**
 * @author chenhuigu
 */
public class BuildTree {
    int[] preorder;
    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        this.preorder = preorder;
        return recursion(0, 0, inorder.length - 1);
    }

    /**
     * 根节点在前序遍历的索引 root 、子树在中序遍历的左边界 left 、子树在中序遍历的右边界 right ；
     *
     * @param root
     * @param left
     * @param right
     * @return
     */
    private TreeNode recursion(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = indexMap.get(preorder[root]);
        node.left = recursion(root + 1, left, i - 1);
        node.right = recursion(root + i - left + 1, i + 1, right);
        return node;
    }

}
