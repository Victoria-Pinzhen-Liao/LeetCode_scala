package LeetcodeUS
object Leetcode_1539_KthMissingPositiveNumber  {
  //  def findKthPositive(arr: Array[Int], k: Int): Int = {
  //    val arrMax = arr.last
  //    val fullList = (1 to arrMax).toSet
  //    val missingNums = fullList.diff(arr.toSet).toSeq.sorted
  //    val missingNumsSize = missingNums.size
  //    if (k > missingNumsSize) {
  //      arrMax + k - missingNumsSize
  //    } else {
  //      missingNums(k - 1)
  //    }
  //  }

  def findKthPositive(arr: Array[Int], k: Int): Int = {
    var currentPos = 1
    var count = k
    while (count != 0) {
      if (arr.contains(currentPos)) {
        // pos in arr
        currentPos += 1
      } else {
        // is missing pos
        count -= 1
        currentPos += 1
      }
    }
    currentPos - 1
  }

  findKthPositive(Array(1, 2), 1)
}
