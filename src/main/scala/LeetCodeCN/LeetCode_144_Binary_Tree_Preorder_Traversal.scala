package LeetCodeCN

object PreorderTraversal  {
  val three = TreeNode(3, null, null)
  val two = TreeNode(2, three, null)
  val root = TreeNode(1, null, two)

  def preorderTraversal(node: TreeNode): List[Int] = {
    if (node != null) {
        node.value :: preorderTraversal(node.left) ++ preorderTraversal(node.right)
    } else List()
  }

  println(preorderTraversal(root))
}