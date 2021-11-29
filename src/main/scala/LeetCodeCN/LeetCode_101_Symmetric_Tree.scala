package LeetCodeCN

object LeetCode_101_Symmetric_Tree {
  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) true else {
      isMirror(root.left, root.right)
    }
  }

  def isMirror(left: TreeNode, right: TreeNode): Boolean = {
    if (left != null & right != null) {
      left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left)
    } else if (left == null && right == null) true else false
  }
}
