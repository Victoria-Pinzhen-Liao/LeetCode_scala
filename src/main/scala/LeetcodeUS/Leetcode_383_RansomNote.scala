package LeetcodeUS

//  383. Ransom Note
object Leetcode_383_RansomNote  {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val ransomNoteDictionary = getDictionary(ransomNote)
    val magazineDictionary = getDictionary(magazine)
    ransomNoteDictionary.forall {
      charToCount => {
        val charToCheck = charToCount._1
        val ransomNoteCount = charToCount._2
        val magazineHasChar: Option[Int] = magazineDictionary.get(charToCheck)
        if (magazineHasChar.isEmpty) {
          false
        } else {
          val magazineCount: Int = magazineHasChar.get
          magazineCount >= ransomNoteCount
        }
      }
    }
  }

  def getDictionary(text: String): Map[Char, Int] = {
    text.groupBy(identity).map(pair => pair._1 -> pair._2.size)
  }

  //    println(canConstruct("aa", "aab"))
}

