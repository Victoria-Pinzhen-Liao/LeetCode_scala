package LeetCodeCN

import LeetCodeCN.LeetCode_543_Diameter_of_Binary_Tree.diameterOfBinaryTree
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_543_Diameter_of_Binary_TreeTest extends AnyFunSuite with Matchers {
  val tree1 = "4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2"
  val tree2 = "1,2,3,null,null,4,5"

  test("Return 3 for this tree's diameter") {
    val tree = deserialize(tree2)
    diameterOfBinaryTree(tree) shouldBe 3
  }

  test("Return 7 for this tree's diameter") {
    val tree = deserialize(tree1)
    diameterOfBinaryTree(tree) shouldBe 7
  }
}
