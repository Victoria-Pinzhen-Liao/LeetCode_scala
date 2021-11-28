package LeetCodeCN


import LeetCodeCN.LeetCode_98_Validate_Binary_Search_Tree.isValidBST
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_98_Validate_Binary_Search_TreeTest extends AnyFunSuite with Matchers {
  val tree1 = "2,1,3"
  val tree2 = "5,1,4,null,null,3,6"

  test("This tree is a valid BST") {
    isValidBST(deserialize(tree1)) shouldBe true
  }

  test("This tree is not a valid BST") {
    isValidBST(deserialize(tree2)) shouldBe false
  }
}
