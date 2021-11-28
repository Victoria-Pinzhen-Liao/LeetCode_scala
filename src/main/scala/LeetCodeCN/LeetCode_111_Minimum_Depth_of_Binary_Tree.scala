package LeetCodeCN


object LeetCode_111_Minimum_Depth_of_Binary_Tree  {
  val seventeen = TreeNode(17, null, null)
  val fifteen = TreeNode(15, null, null)
  val twenty = TreeNode(20, fifteen, seventeen)
  val nine = TreeNode(9, null, null)
  val root = TreeNode(3, nine, twenty)


  def minDepth(root: TreeNode): Int = {
    if (root == null) 0 else {
      val left = root.left
      val right = root.right
      (left, right) match {
        case (null, null) => 1
        case (null, right) => minDepth(right) + 1
        case (left, null) => minDepth(left) + 1
        case (left, right) => Math.min(minDepth(left), minDepth(right)) + 1
      }
    }
  }


  //  def minDepth(root: LeetCodeCN.TreeNode): Int = {
  //    if (root == null) 0 else {
  //      if (root.left != null && root.right != null) {
  //        Math.min(minDepth(root.left), minDepth(root.right)) + 1
  //      } else if (root.left != null) {
  //        minDepth(root.left) + 1
  //      } else if (root.right != null) {
  //        minDepth(root.right) + 1
  //      } else 1
  //    }
  //  }

  println(minDepth(root)) // 2
}




