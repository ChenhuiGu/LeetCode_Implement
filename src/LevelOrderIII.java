package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderIII {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                tmp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(tmp);
            if(queue.isEmpty()) break;

            tmp = new ArrayList<>();
            size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeLast();
                tmp.add(node.val);
                if (node.right != null) queue.addFirst(node.right);
                if (node.left != null) queue.addFirst(node.left);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
