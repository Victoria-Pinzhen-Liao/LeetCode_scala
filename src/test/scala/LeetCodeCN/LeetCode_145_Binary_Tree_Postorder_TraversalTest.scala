package LeetCodeCN

import LeetCodeCN.LeetCode_145_Binary_Tree_Postorder_Traversal.postOrderTraversal
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_145_Binary_Tree_Postorder_TraversalTest extends AnyFunSuite with
  Matchers {
  test("Preorder traversal result of this tree should be List(3, 2, 1)") {
    postOrderTraversal(deserialize("1,null,2,3")) shouldBe List(3, 2, 1)
  }
}
