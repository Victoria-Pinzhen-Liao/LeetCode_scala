package LeetCodeCN

object LeetCode_536_Construct_Binary_Tree_fromString  {
  //  Scala dependency

  import scala.util.matching.Regex

  val leaf: Regex = raw"(-*\d+)".r
  val root: Regex = raw"($leaf)\(($root)\)[\(($root)\)]{0,1}".r


  val s = "4(2(3)(1))(6(5)(7))"
  val tree = str2tree(s)

  def str2tree(s: String): TreeNode = {
    if (s != "") {
      s match {
        case root(root, left, right) => new TreeNode(root.toInt, str2tree(left), str2tree(right))
        case leaf(root) => new TreeNode(root.toInt, null, null)
        case _ => throw new IllegalArgumentException(s"$s should be a valid node")
      }
    } else null
  }

  println(tree.value)
}
