package LeetCodeCN

object LeetCode_94_Binary_Tree_Inorder_Traversal {
  def inorderTraversal(root: TreeNode): List[Int] = {
    if (root != null) {
      {
        inorderTraversal(root.left) :+ root.value
      } ++ inorderTraversal(root.right)
    } else List()
  }
}