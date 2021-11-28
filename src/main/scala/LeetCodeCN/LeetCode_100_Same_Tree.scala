package LeetCodeCN

object LeetCode_100_Same_Tree  {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    (p, q) match {
      case (null, null) => true
      case (p, null) => false
      case (null, q) => false
      case (p, q) => {
        p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
      }
    }
  }
}
