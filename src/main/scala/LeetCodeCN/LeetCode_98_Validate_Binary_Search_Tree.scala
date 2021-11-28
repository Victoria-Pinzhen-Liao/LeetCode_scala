package LeetCodeCN

object LeetCode_98_Validate_Binary_Search_Tree {
  def isValidBST(root: TreeNode): Boolean = {
    validate(root, Long.MinValue, Long.MaxValue)
  }

  def validate(node: TreeNode, min: Long, max: Long): Boolean = {
    if (node == null) true else {
      if (node.value > min && node.value < max) {
        validate(node.left, min, node.value) && validate(node.right, node.value, max)
      } else false
    }
  }
}
