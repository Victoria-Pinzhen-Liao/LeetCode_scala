package LeetCodeCN

object LeetCode_101_Symmetric_Tree  {

  val three = TreeNode(3, null, null)
  val twoLeft = TreeNode(2, null, null)
  val twoRight = TreeNode(2, null, null)
  val symmetricRoot = TreeNode(1, twoLeft, twoRight)
  val nonSymmetricRoot = TreeNode(1, twoLeft, three)


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

  println(isSymmetric(symmetricRoot)) // true
  println(isSymmetric(nonSymmetricRoot)) // false
}
