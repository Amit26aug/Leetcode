object Solution {
    def maxDepth2(root: TreeNode): Int = {
         if (root != null) 1 + (maxDepth(root.left) max maxDepth(root.right)) else 0
    }
    
    def maxDepth(root: TreeNode): Int = {
        root match {
            case null => 0
            case r => 1 + (maxDepth(r.left) max maxDepth(r.right))
        }
    }
}