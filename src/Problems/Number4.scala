package Problems

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Number4 extends App {

  val palindromeNumbers = for {
    a <- 100 to 999
    b <- 100 to 999
    if isPalindrome((a * b).toString)
  } yield a * b

  def isPalindrome(string: String): Boolean = {
    if (string.length <= 1) {
      true
    } else if (string.head == string.last) {
      isPalindrome(string.substring(1, string.length - 1))
    } else {
      false
    }
  }

  println(palindromeNumbers.max)

}
