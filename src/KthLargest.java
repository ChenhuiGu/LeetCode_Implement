package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class KthLargest {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if (root == null) return;
        // 倒序
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        dfs(root.left);
    }
}
