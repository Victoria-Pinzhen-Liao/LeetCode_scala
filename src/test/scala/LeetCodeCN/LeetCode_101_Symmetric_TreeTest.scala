package LeetCodeCN

import LeetCodeCN.LeetCode_101_Symmetric_Tree.isSymmetric
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_101_Symmetric_TreeTest extends AnyFunSuite with Matchers {
  val tree1 = deserialize("2,1,1")
  val tree2 = deserialize("2,1,3")

  test("return true if a tree is symmetric") {
    isSymmetric(tree1) shouldBe true
  }

  test("return false if a tree is not symmetric") {
    isSymmetric(tree2) shouldBe false
  }
}
