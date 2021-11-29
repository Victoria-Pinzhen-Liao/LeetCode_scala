package LeetCodeCN

object LeetCode_449_Serialize_and_Deserialize_BST {
  // Encodes a list of strings to a single string.
  def serialize(root: TreeNode): String = {
    def preorderTraversal(root: TreeNode): List[Int] = {
      Option(root) match {
        case Some(node) => List(node.value) ++ preorderTraversal(node.left) ++ preorderTraversal(node.right)
        case _ => List()
      }
    }

    preorderTraversal(root).mkString(",")
  }

  // Decodes a single string to a list of strings.
  def deserialize(data: String): TreeNode = {
    if (data.length() == 0) return null
    val preorder = data.split(",").map(_.toInt)
    val inorder = preorder.sorted
    var index = 0

    def buildTreeNode(from: Int, to: Int): TreeNode = {
      if (from > to) return null
      val value = preorder(index)
      index += 1
      val inorderIndex = inorder.indexOf(value, from)
      val left = buildTreeNode(from, inorderIndex - 1)
      val right = buildTreeNode(inorderIndex + 1, to)
      new TreeNode(value, left, right)
    }

    buildTreeNode(0, inorder.length - 1)
  }
}
