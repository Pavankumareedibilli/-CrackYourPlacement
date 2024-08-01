class Solution
{
    int getCount(Node root, int l, int h)
    {
        if (root == null) return 0;

        int count = 0;

        if (root.data >= l && root.data <= h) {
            count = 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        }
       
        else if (root.data < l) {
            count = getCount(root.right, l, h);
        }
        
        else {
            count = getCount(root.left, l, h);
        }

        return count;
    }
}
