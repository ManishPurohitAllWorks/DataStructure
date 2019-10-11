package Tree;

public class BinaryTree
{
    // Root of Binary Tree
    TreeNode root;

    BinaryTree()
    {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(TreeNode treeNode)
    {
        if (treeNode == null)
            return;

        // first recur on left subtree
        printPostorder(treeNode.left);

        // then recur on right subtree
        printPostorder(treeNode.right);

        // now deal with the treeNode
        System.out.print(treeNode.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(TreeNode treeNode)
    {
        if (treeNode == null)
            return;

        /* first recur on left child */
        printInorder(treeNode.left);

        /* then print the data of treeNode */
        System.out.print(treeNode.key + " ");

        /* now recur on right child */
        printInorder(treeNode.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode treeNode)
    {
        if (treeNode == null)
            return;

        /* first print data of treeNode */
        System.out.print(treeNode.key + " ");

        /* then recur on left sutree */
        printPreorder(treeNode.left);

        /* now recur on right subtree */
        printPreorder(treeNode.right);
    }

    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }

    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(1);
        tree.root.right.right = new TreeNode(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
    //    tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
      //  tree.printPostorder();
    }
}
