package LeetCodeCN

object LeetCode_112_Path_Sum  {
  val two = TreeNode(2, null, null)
  val seven = TreeNode(7, null, null)
  val eleven = TreeNode(11, seven, two)
  val fourLeft = TreeNode(4, eleven, null)
  val one = TreeNode(1, null, null)
  val fourRight = TreeNode(4, null, one)
  val thirteen = TreeNode(13, null, null)
  val eight = TreeNode(8, thirteen, fourRight)
  val root = TreeNode(5, fourLeft, eight)

  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    if (root == null) {
      if (targetSum == 0) true else false
    } else {
      val left = root.left
      val right = root.right
      val rootValue = root.value
      hasPathSum(left, targetSum - rootValue) || hasPathSum(right, targetSum - rootValue)
    }
  }

  println(hasPathSum(root, 22))
  println(hasPathSum(root, 26))
  println(hasPathSum(root, 25))

}