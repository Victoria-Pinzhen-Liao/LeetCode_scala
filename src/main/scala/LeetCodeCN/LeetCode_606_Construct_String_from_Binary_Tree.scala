package LeetCodeCN

object LeetCode_606_Construct_String_from_Binary_Tree  {

  val four = TreeNode(4, null, null)
  val three = TreeNode(3, null, null)
  val two = TreeNode(2, four, null)
  val one = TreeNode(1, two, three)

  val emptyStr = ""
  val emptyNode = "()"

  def tree2str(root: TreeNode): String = {
    if (root == null) emptyStr else {
      val left = root.left
      val right = root.right
      val (leftStr, rightStr) = (left, right) match{
        case (null, null) => (emptyStr,emptyStr)
        case (left, null) => (s"(${tree2str(root.left)})", emptyStr)
        case (null, right) => (emptyNode, s"(${tree2str(root.right)})")
        case (left, right) => (s"(${tree2str(root.left)})", s"(${tree2str(root.right)})")
      }
      s"${root.value}" + leftStr + rightStr
    }
  }

  println(tree2str(one))
}
