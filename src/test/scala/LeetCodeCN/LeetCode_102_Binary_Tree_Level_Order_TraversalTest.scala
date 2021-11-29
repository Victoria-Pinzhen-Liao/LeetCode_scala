package LeetCodeCN

import LeetCodeCN.LeetCode_102_Binary_Tree_Level_Order_Traversal.levelOrder
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_102_Binary_Tree_Level_Order_TraversalTest extends AnyFunSuite with
  Matchers {
  test("Level order traversal result of this tree should be  [[3],[9,20],[15,7]]") {
    levelOrder(deserialize("3,9,20,null,null,15,7")) shouldBe List(List(3), List(9,
      20), List(15, 7))
  }
}
