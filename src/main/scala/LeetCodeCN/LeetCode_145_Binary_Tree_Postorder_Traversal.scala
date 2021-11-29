package LeetCodeCN

object LeetCode_145_Binary_Tree_Postorder_Traversal {
  def postOrderTraversal(node: TreeNode): List[Int] = {
    if (node != null) {
      postOrderTraversal(node.left) ++ postOrderTraversal(node.right) :+ node.value
    } else List()
  }
}