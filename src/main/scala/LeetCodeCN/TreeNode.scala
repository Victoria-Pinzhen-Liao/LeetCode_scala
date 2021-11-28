package LeetCodeCN

import scala.collection.mutable.{ArrayBuffer, Queue}


case class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}


object TreeNode {

  /**
   * Definition for a binary tree node.
   * class LeetCodeCN.TreeNode(var _value: Int) {
   * var value: Int = _value
   * var left: LeetCodeCN.TreeNode = null
   * var right: LeetCodeCN.TreeNode = null
   * }
   */


  // Encodes a list of strings to a single string.
  def serialize(root: TreeNode): String = {
    if (root == null) {
       ""
    }

    val nodes: ArrayBuffer[String] = ArrayBuffer.empty[String]
    val queue: Queue[TreeNode] = Queue[TreeNode](root)

    while (!queue.isEmpty) {
      val node: TreeNode = queue.dequeue()

      if (node == null) {
        nodes += null
      }
      else {
        nodes += node.value.toString
        queue.enqueue(node.left)
        queue.enqueue(node.right)
      }
    }

    while (nodes.last == null) {
      nodes.remove(nodes.length - 1)
    }

    nodes.mkString(",")
  }

  // Decodes a single string to a list of strings.
  def deserialize(data: String): TreeNode = {
    if (data.length == 0) {
       null
    }
    val nodes: Array[String] = data.split(",")
    val root = parseToTreeNode(nodes(0))
    val queue: Queue[TreeNode] = Queue[TreeNode](root)
    var index = 1

    while (!queue.isEmpty && index <= nodes.length - 1) {
      val node = queue.dequeue()
      val left = parseToTreeNode(nodes(index))
      index += 1
      if (left != null) {
        node.left = left
        queue.enqueue(left)
      }

      if (index <= nodes.length - 1) {
        val right = parseToTreeNode(nodes(index))
        index += 1
        if (right != null) {
          node.right = right
          queue.enqueue(right)
        }
      }

    }
    root
  }

  def parseToTreeNode(node: String): TreeNode = {
    if (node.equals("null")) {
       null
    }
    else {
      new TreeNode(node.toInt)
    }
  }


}