package LeetCodeCN

import LeetCodeCN.LeetCode_100_Same_Tree.isSameTree
import LeetCodeCN.TreeNode.deserialize
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_100_Same_TreeTest extends AnyFunSuite with Matchers {
  val tree1 = deserialize("2,1,3")
  val tree2 = deserialize("1,2,3,null,null,4,5")

  test("return true if two trees are the same") {
    isSameTree(tree1, tree1) shouldBe true
  }

  test("return false if two trees are not the same") {
    isSameTree(tree1, tree2) shouldBe false
  }
}
