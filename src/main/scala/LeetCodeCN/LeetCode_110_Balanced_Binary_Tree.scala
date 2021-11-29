package LeetCodeCN

import scala.math._

object LeetCode_110_Balanced_Binary_Tree {
  def getHeight(root: TreeNode): Int = {
    if (root == null) 0 else {
      max(getHeight(root.right), getHeight(root.left)) + 1
    }
  }

  def isBalanced(root: TreeNode): Boolean = {
    if (root == null) true else {
      val rootBalanced: Boolean = abs(getHeight(root.right) - getHeight(root.left)) <= 1
      if (!rootBalanced) {
        println(root)
      }
      rootBalanced && isBalanced(root.left) && isBalanced(root.right)
    }
  }
}



