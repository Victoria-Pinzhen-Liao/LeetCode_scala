package LeetCodeCN

object LeetCode_572_Subtree_of_Another_Tree  {

  // Tree 1
  //  val two = LeetCodeCN.TreeNode(2, null, null)
  //  val one = LeetCodeCN.TreeNode(1, null, null)
  //  val four = LeetCodeCN.TreeNode(4, one, two)
  //  val five = LeetCodeCN.TreeNode(5, null, null)
  //  val three = LeetCodeCN.TreeNode(3, four, five)
  //  val six = LeetCodeCN.TreeNode(6, null, null)

  // Tree 2


  val l5_2 = TreeNode(2, null, null)
  val l4_1 = TreeNode(1, l5_2, null)
  val l3_1 = TreeNode(1, null, l4_1)
  val l2_1 = TreeNode(1, null, l3_1)
  val l1_1 = TreeNode(1, null, l2_1)



  // -----------------------------------------------------

  //  val emptyNode = "()"
  //  var subNodeSet: Set[String] = Set()

  //  def tree2str(root: LeetCodeCN.TreeNode): String = {
  //    if (root == null) emptyNode else {
  //      s"${root.value}(${tree2str(root.left)}(${tree2str(root.right)}"
  //    }
  //  }
  //
  //  def updateSubTreeSet(root: LeetCodeCN.TreeNode): Unit = {
  //    if (root != null) {
  //      val nodeId = tree2str(root)
  //
  //      subNodeSet += nodeId
  //
  //      updateSubTreeSet(root.left)
  //      updateSubTreeSet(root.right)
  //    }
  //  }
  //
  //  def isSubtree(root: LeetCodeCN.TreeNode, subRoot: LeetCodeCN.TreeNode): Boolean = {
  //    val serializedSubRoot = tree2str(subRoot)
  //    updateSubTreeSet(root)
  //    val isSubtree = subNodeSet.contains(serializedSubRoot)
  //    subNodeSet = Set()
  //    isSubtree
  //  }

  // -----------------------------------------------------------------------------------------------------

  //    [1,null,1,null,1,null,1,2]
  //    [1,null,1,null,1,2]


  def identical(root: TreeNode, subRoot: TreeNode): Boolean = {
    (root, subRoot) match {
      case (null, null) => true
      case (null, subRoot) => false
      case (root, null) => false
      case (root, subRoot) => root.value == subRoot.value && identical(root.left, subRoot.left) && identical(root.right, subRoot.right)
    }
  }

  def traveralCheck(root: TreeNode, subRoot: TreeNode, currentResult: Set[Boolean]): Set[Boolean] = {
    if (root == null) currentResult else {
      currentResult + identical(root, subRoot) + identical(root.left, subRoot) + identical(root.right, subRoot)
    }
  }

  def isSubtree(root: TreeNode, subRoot: TreeNode): Boolean = {
    traveralCheck(root, subRoot, Set()).contains(true)
  }

  //  println(isSubtree(three, five)) // true
  //  println(isSubtree(three, four)) // true
  //  println(isSubtree(three, six)) // false
  println(isSubtree(l1_1, l2_1)) // true
}
