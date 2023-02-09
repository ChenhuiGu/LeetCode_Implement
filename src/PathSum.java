package src;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root,target);
        return res;
    }
    // 深度优先遍历，先序遍历(中、右、左)
    private void dfs(TreeNode root,int target){
        if(root == null) return;
        target -= root.val;
        path.add(root.val);
        if(target == 0 && root.right == null && root.left == null){
            res.add(new ArrayList<>(path));
        }
        dfs(root.right,target);
        dfs(root.left,target);
        path.removeLast();
    }
}
