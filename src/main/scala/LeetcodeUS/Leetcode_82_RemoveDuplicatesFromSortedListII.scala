package LeetcodeUS
import scala.collection.mutable


class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}


object Leetcode_82_RemoveDuplicatesFromSortedListII  {


  def deleteDuplicates(headNode: ListNode): ListNode = {


    if (headNode == null) {
      headNode
    } else {
      val valueSet = mutable.Set.empty[Int]

      def linkNodes(lastNode: ListNode, currentNode: ListNode, nextNode: ListNode): Unit = {
        if (nextNode == null) {
          if (valueSet.contains(currentNode.x)) {
            lastNode.next = null
          } else {
            lastNode.next = currentNode
          }
        } else {
          if (valueSet.contains(currentNode.x)) {
            if (nextNode.next != null) {
              linkNodes(lastNode, nextNode, nextNode.next)
            } else {
              linkNodes(lastNode, nextNode, null)
            }
          } else {
            lastNode.next = currentNode
            valueSet += currentNode.x
            if (nextNode.next != null) {
              linkNodes(lastNode, nextNode, nextNode.next)
            } else {
              linkNodes(lastNode, nextNode, null)
            }
          }
        }

      }

      val dummyHeadNode = new ListNode(Int.MaxValue, headNode)
      linkNodes(dummyHeadNode, headNode, headNode.next)
      dummyHeadNode.next
    }
  }
}
