package LeetcodeUS

object Leetcode_526_BeautifulArrangement  {
  def isBeautifulArrangement(numberToCheck: Int, nextNumberSeq: Seq[Int], index: Int): Seq[Boolean] = {
    if (numberToCheck % index == 0 || index % numberToCheck == 0) {
      if (nextNumberSeq.nonEmpty) {
        nextNumberSeq.flatMap { number =>
          isBeautifulArrangement(number, nextNumberSeq.filterNot(_ == number), index + 1)
        }
      } else {
        Seq(true)
      }
    }
    else {
      Seq(false)
    }
  }

  def countArrangement(n: Int): Int = {
    val numberSeq: Seq[Int] = 1 to n
    val startPosition = 1
    val countBeautifulArrangement: Seq[Boolean] = numberSeq.flatMap { number =>
      isBeautifulArrangement(number, numberSeq.filterNot(_ == number), startPosition)
    }
    countBeautifulArrangement.count(_ == true)
  }


  println(countArrangement(1))
  println(countArrangement(2))
}
