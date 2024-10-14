public class BinarySearchTree1 {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert a node into the binary search tree
    Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    // Delete a node from the binary search tree
    Node delNode(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delNode(root.left, key);
        } else if (key > root.data) {
            root.right = delNode(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // Node with two children
                root.data = minValue(root.right);
                root.right = delNode(root.right, root.data);
            }
        }
        return root;
    }

    // Find the minimum value node in the right subtree
    int minValue(Node root) {
        int x = root.data;
        while (root.left != null) {
            root = root.left;
            x = root.data;
        }
        return x;
    }

    // Insert a key into the tree
    public void insert(int key) {
        root = insertNode(root, key);
    }

    // In-order traversal to print the tree
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Node class representing a tree node
    public class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        
        // Insert nodes into the binary tree
        bt.insert(10);
        bt.insert(5);
        bt.insert(12);
        bt.insert(3);
        bt.insert(6);
        bt.insert(11);
        bt.insert(22);
        bt.insert(18);
        bt.insert(33);

        System.out.println("In-order traversal of the tree:");
        bt.inorderTraversal(bt.root);

        // Delete a node and perform another traversal
        System.out.println("\nDeleting node 12...");
        bt.delNode(bt.root, 12);

        System.out.println("In-order traversal after deletion:");
        bt.inorderTraversal(bt.root);
    }
}
