package LeetCodeCN

object LeetCode_226_Invert_Binary_Tree  {
  val three = TreeNode(3, null, null)
  val one = TreeNode(1, null, null)
  val two = TreeNode(2, one, three)

  def invertTree(root: TreeNode): TreeNode = {
    if (root != null) {
      val left = root.left
      val right = root.right
      root.left = right
      root.right = left
      invertTree(root.left)
      invertTree(root.right)
    }
    root
  }
}
