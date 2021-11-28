package LeetcodeUS

object Leetcode_21_MergeTwoSortedLists  {
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {

    val head = new ListNode(Int.MaxValue)
    val tail = head

    def _mergeList(l1: ListNode, l2: ListNode, curr: ListNode): ListNode = {
      (l1, l2) match {
        case (null, null) => head
        case (l1, null) => curr.next = l1;
          head
        case (null, l2) => curr.next = l2;
          head
        case (l1, l2) if l1.x >= l2.x => curr.next = l2;
          _mergeList(l1, l2.next, curr.next)
        case (l1, l2) if l1.x < l2.x => curr.next = l1;
          _mergeList(l1.next, l2, curr.next)
        case _ => throw new IllegalArgumentException(s"$curr, $l1 and $l2 should be valid nodes")
      }
    }

    _mergeList(l1, l2, tail)

    head.next

  }
}
