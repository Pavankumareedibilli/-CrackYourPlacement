static class Solution {
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        return constructBST(pre, 0, size - 1);
    }

    private Node constructBST(int[] pre, int start, int end) {
        if (start > end) {
            return null;
        }

        Node root = new Node(pre[start]);
        int i;

        for (i = start + 1; i <= end; i++) {
            if (pre[i] > root.data) {
                break;
            }
        }

        root.left = constructBST(pre, start + 1, i - 1);
        root.right = constructBST(pre, i, end);

        return root;
    }
}
