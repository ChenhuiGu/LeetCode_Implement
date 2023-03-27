package src;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor01(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) { // 保证q.val > p.val
            TreeNode tmp = q;
            q = p;
            p = tmp;
        }
        while (root != null) {
            if (root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
