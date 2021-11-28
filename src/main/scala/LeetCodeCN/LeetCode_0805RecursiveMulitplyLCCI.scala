package LeetCodeCN

object LeetCode_0805RecursiveMulitplyLCCI  {

  // A = 2, B = 4
  // * * * *
  // * * * *

  // A = 3, B = 4
  // * * * *
  // * * * *
  // * * * *

  def multiply(A: Int, B: Int): Int = {
    if (A < B) multiplyHelper(A, B) else multiplyHelper(B, A)
  }

  def multiplyHelper(A: Int, B: Int): Int = {
    if (A == 1) B else {
      if (A % 2 == 0) {
        multiply(A / 2, B) + multiply(A / 2, B)
      } else {
        multiply((A + 1) / 2, B) + multiply((A - 1) / 2, B)
      }
    }
  }
}
