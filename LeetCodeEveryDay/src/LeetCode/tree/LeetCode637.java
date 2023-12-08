package LeetCode.tree;

import LeetCode.tree.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null)   return res;
        Queue<TreeNode> treeNodeQueue = new ArrayDeque<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQueue.poll();
                sum += node.val;
                if (node.left != null) {
                    treeNodeQueue.add(node.left);
                }
                if (node.right != null) {
                    treeNodeQueue.add(node.right);
                }
            }
            res.add((double)sum * 1.0 / size);
        }
        return res;
    }
}
