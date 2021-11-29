package LeetCodeCN

object LeetCode_144_Binary_Tree_Preorder_Traversal {
  def preorderTraversal(node: TreeNode): List[Int] = {
    if (node != null) {
      node.value :: preorderTraversal(node.left) ++ preorderTraversal(node.right)
    } else List()
  }
}