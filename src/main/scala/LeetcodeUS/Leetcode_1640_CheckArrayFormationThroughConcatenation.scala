package LeetcodeUS

// 1640. Check Array Formation Through Concatenation



object Leetcode_1640_CheckArrayFormationThroughConcatenation  {

  import scala.annotation.tailrec
  def canFormArray(array: Array[Int], pieces: Array[Array[Int]]): Boolean = {

    val pieceDictionary: Map[Int, Array[Int]] = pieces.map { piece => piece.head -> piece }.toMap
    val lastIndex: Int = array.indices.last

    @tailrec
    def matchSubArray(startIndex: Int, pieceDictionary: Map[Int, Array[Int]], lastIndex: Int): Boolean = {
      if (startIndex > lastIndex) true
      else {
        val expectedPieceHead = array(startIndex)
        val matchedPieceForHeadOption: Option[Array[Int]] = pieceDictionary.get(expectedPieceHead)
        if (matchedPieceForHeadOption.isEmpty) {
          false
        } else {
          val matchedPieceForHead: Array[Int] = matchedPieceForHeadOption.get
          val endIndex: Int = startIndex + matchedPieceForHead.length
          val arrayHeadForMatch: Array[Int] = array.slice(startIndex, startIndex + matchedPieceForHead.length)
          if (arrayHeadForMatch == matchedPieceForHead) {
            matchSubArray(endIndex, pieceDictionary - expectedPieceHead, lastIndex)
          } else {
            false
          }
        }
      }
    }

    matchSubArray(0, pieceDictionary, lastIndex)
  }

  //  val test1 = canFormArray(Array(81), Array(Array(81))) // true
  //  val test2 = canFormArray(Array(82, 12), Array(Array(12, 82))) // false
  //  val test3 = canFormArray(Array(83, 13), Array(Array(83), Array(13))) // true
  //  val test4 = canFormArray(Array(84, 14), Array(Array(84, 14))) // true
  val test5 = canFormArray(Array(1, 3, 5, 7), Array(Array(2, 4, 6, 8))) // false

}

