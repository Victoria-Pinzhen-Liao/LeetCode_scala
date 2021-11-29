package LeetCodeCN

import LeetCodeCN.LeetCode_94_Binary_Tree_Inorder_Traversal.inorderTraversal
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_94_Binary_Tree_Inorder_TraversalTest extends AnyFunSuite with Matchers {
  test("Inorder Traversal result of this tree should be List(1, 3, 2)") {
    inorderTraversal(deserialize("1,null,2,3")) shouldBe List(1, 3, 2)
  }
}
