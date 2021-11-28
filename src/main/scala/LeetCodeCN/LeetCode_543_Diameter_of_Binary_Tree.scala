package LeetCodeCN

object LeetCode_543_Diameter_of_Binary_Tree {

  import scala.math.max

  var diameters: Set[Int] = Set()

  def maxDiameter(root: TreeNode): Int = {
    if (root == null) 0 else {
      val left = root.left
      val right = root.right
      (left, right) match {
        case (null, null) => 1
        case (left, null) => 1 + maxDiameter(left)
        case (null, right) => 1 + maxDiameter(right)
        case (left, right) => max(maxDiameter(right), maxDiameter(left)) + 1
      }
    }
  }

  def addDiameterOfNode(root: TreeNode): Unit = {
    val diameter = if (root == null) 0 else {
      val left = root.left
      val right = root.right
      (left, right) match {
        case (null, null) => 0
        case (left, null) => maxDiameter(left)
        case (null, right) => maxDiameter(right)
        case (left, right) => maxDiameter(right) + maxDiameter(left)
      }
    }
    diameters += diameter
  }

  def traversal(root: TreeNode): Unit = {
    if (root != null) {
      addDiameterOfNode(root)
      addDiameterOfNode(root.left)
      addDiameterOfNode(root.right)
    }
  }

  def diameterOfBinaryTree(root: TreeNode): Int = {
    traversal(root)
    val diameter = diameters.max
    diameters = Set()
    diameter
  }
}
