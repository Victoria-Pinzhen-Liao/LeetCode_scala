package LeetCodeCN

object InorderTraversal  {
  val three = TreeNode(3, null, null)
  val two = TreeNode(2, three, null)
  val root = TreeNode(1, null, two)

  def inorderTraversal(node: TreeNode): List[Int] = {
    if (node != null) {
      {
        inorderTraversal(node.left) :+ node.value
      } ++ inorderTraversal(node.right)
    } else List()
  }

  println(inorderTraversal(root))
}