package src;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author chenhuigu
 *
 * add 增加一个元索 如果队列已满，则抛出一个IIIegaISlabEepeplian异常
 *
 * remove 移除并返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
 *
 * element 返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
 *
 * offer 添加一个元素并返回true 如果队列已满，则返回false
 *
 * poll 移除并返问队列头部的元素 如果队列为空，则返回null
 *
 * peek 返回队列头部的元素 如果队列为空，则返回null
 *
 * put 添加一个元素 如果队列满，则阻塞
 *
 * take 移除并返回队列头部的元素 如果队列为空，则阻塞
 */
public class LevelOrder {

    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            ans.add(node.val);
            // 添加null不抛出异常
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int size = ans.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
