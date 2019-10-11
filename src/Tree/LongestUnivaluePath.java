package Tree;

public class LongestUnivaluePath {
    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
     boolean ans1=true;
    public  Boolean sameTree(TreeNode root1,TreeNode root2)
    {
        if(root1 == null && root2 != null)
            return false;

        else if(root1 != null && root2 == null)
            return false;

        else if(root1 == null && root2 == null)
            return true;

        else if(root1.key != root2.key)
            return false;


     return  sameTree(root1.left, root2.left) &&  sameTree(root1.right, root2.right);
    }

    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.key == node.key) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.key == node.key) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
    public static void main(String agrs[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(2);
        tree.root.right.right = new TreeNode(5);

        System.out.println( new LongestUnivaluePath().longestUnivaluePath(tree.root));

    }
}
