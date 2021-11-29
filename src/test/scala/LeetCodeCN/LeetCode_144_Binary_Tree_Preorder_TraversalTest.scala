package LeetCodeCN

import LeetCodeCN.LeetCode_144_Binary_Tree_Preorder_Traversal.preorderTraversal
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_144_Binary_Tree_Preorder_TraversalTest extends AnyFunSuite with
  Matchers {
  test("Preorder traversal result of this tree should be List(1, 2, 3)") {
    preorderTraversal(deserialize("1,null,2,3")) shouldBe List(1, 2, 3)
  }
}
