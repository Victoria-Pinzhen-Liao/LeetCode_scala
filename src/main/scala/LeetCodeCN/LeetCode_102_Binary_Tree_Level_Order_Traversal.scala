package LeetCodeCN

//import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object LeetCode_102_Binary_Tree_Level_Order_Traversal {

//  def levelOrder(root: LeetCodeCN.TreeNode): List[List[Int]] = {
//    val currentTraversalResult = List()
//    if (root != null) {
//      traversal(List(root), currentTraversalResult)
//    } else currentTraversalResult
//  }
//
//  @tailrec
//  def traversal(currentLevel: List[LeetCodeCN.TreeNode], currentTraversalResult: List[List[Int]]): List[List[Int]] = {
//    if (currentLevel.nonEmpty) {
//      val newTraversalResult = currentTraversalResult :+ currentLevel.map(_.value)
//      val nextLevel: List[LeetCodeCN.TreeNode] = currentLevel.map(node => List(node.left, node.right)).flatten.filter(_ != null)
//      traversal(nextLevel, newTraversalResult)
//    } else currentTraversalResult
//  }




    def levelOrder(root: TreeNode): List[List[Int]] = {
      if (root == null) return List[List[Int]]()
      val result = new ListBuffer[List[Int]]()
      val queue = new mutable.Queue[TreeNode]()
      queue.enqueue(root)
      while (queue.nonEmpty) {
        val levelResult = new ListBuffer[Int]()
        var levelSize = queue.size
        while (levelSize > 0) {
          val item = queue.dequeue()
          levelResult.append(item.value)
          if (item.left != null) {
            queue.enqueue(item.left)
          }
          if (item.right != null) {
            queue.enqueue(item.right)
          }
          levelSize = levelSize - 1
        }
        result.append(levelResult.toList)
      }
      result.toList
    }

}




