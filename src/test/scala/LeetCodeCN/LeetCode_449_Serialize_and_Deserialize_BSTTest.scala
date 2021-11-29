package LeetCodeCN

import LeetCodeCN.LeetCode_100_Same_Tree.isSameTree
import LeetCodeCN.LeetCode_449_Serialize_and_Deserialize_BST.{deserialize, serialize}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class LeetCode_449_Serialize_and_Deserialize_BSTTest extends AnyFunSuite with
  Matchers {
  test("Trees should be the same before & after deserialize and serialize ") {
    val twenty = TreeNode(20, null, null)
    val nine = TreeNode(9, null, null)
    val root1 = TreeNode(10, nine, twenty)

    val tree1Serialized = serialize(root1)
    val tree1Deserialized = deserialize(tree1Serialized)
    isSameTree(tree1Deserialized, root1) shouldBe true
  }
}
