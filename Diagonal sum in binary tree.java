import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class DiagonalSumBinaryTree {

    // Recursive method to calculate the diagonal sum
    private static void diagonalSumUtil(TreeNode root, int diagonal, Map<Integer, Integer> diagonalSumMap) {
        if (root == null) {
            return;
        }

        
        diagonalSumMap.put(diagonal, diagonalSumMap.getOrDefault(diagonal, 0) + root.data);

        
        diagonalSumUtil(root.left, diagonal + 1, diagonalSumMap);

        
        diagonalSumUtil(root.right, diagonal, diagonalSumMap);
    }

    public static Map<Integer, Integer> diagonalSum(TreeNode root) {
        Map<Integer, Integer> diagonalSumMap = new HashMap<>();
        diagonalSumUtil(root, 0, diagonalSumMap);
        return diagonalSumMap;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);

        Map<Integer, Integer> diagonalSumMap = diagonalSum(root);

        System.out.println("Diagonal sums in the binary tree:");
        for (Map.Entry<Integer, Integer> entry : diagonalSumMap.entrySet()) {
            System.out.println("Diagonal " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
