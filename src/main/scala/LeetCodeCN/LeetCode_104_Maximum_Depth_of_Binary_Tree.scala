package LeetCodeCN

object LeetCode_104_Maximum_Depth_of_Binary_Tree  {
  val seventeen = TreeNode(17, null, null)
  val fifteen = TreeNode(15, null, null)
  val twenty = TreeNode(20, fifteen, seventeen)
  val nine = TreeNode(9, null, null)
  val root = TreeNode(3, nine, twenty)

  def maxDepth(root: TreeNode): Int = {
    if (root == null) 0 else {
      Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
    }
  }
  println(maxDepth(root)) // 3
}




