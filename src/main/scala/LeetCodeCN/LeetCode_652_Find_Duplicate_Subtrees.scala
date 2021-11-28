package LeetCodeCN


object LeetCode_652_Find_Duplicate_Subtrees  {
  val rightOne = TreeNode(1, null, null)
  val leftOne = TreeNode(1, null, null)
  val two = TreeNode(2, leftOne, rightOne)

  val emptyNode = "()"

  var dic: Map[String, (TreeNode, Int)] = Map()

  def tree2str(root: TreeNode): String = {
    if (root == null) emptyNode else {
      s"${root.value}(${tree2str(root.left)}(${tree2str(root.right)}"
    }
  }

  def updateNodeDictionary(root: TreeNode): Unit = {
    if (root != null) {
      val nodeId = tree2str(root)
      val nodeCount = dic.get(nodeId)
      val newNodeCount = if (nodeCount.nonEmpty) {
        nodeCount.get._2 + 1
      } else {
        1
      }
      dic += nodeId -> (root, newNodeCount)
      updateNodeDictionary(root.left)
      updateNodeDictionary(root.right)
    }
  }

  def findDuplicateSubtrees(root: TreeNode): List[TreeNode] = {
    updateNodeDictionary(root)
    val duplicatedNodes: List[TreeNode] = dic.toSeq.collect { case (nodeId, (node, count)) if (count > 1) => node }.toList
    dic = Map()
    duplicatedNodes
  }

  println(findDuplicateSubtrees(two).map(_.value))

}
