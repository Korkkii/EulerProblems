package Problems

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
object Number5 extends App {

  def divisibleByAllNumbersUpTo(max: Int) = {
    val range = 1 to max
    var n = 0
    var found = false
    while (!found) {
      n += max
      found = range.forall(n % _ == 0)
    }
    n
  }

  println(divisibleByAllNumbersUpTo(10)) // Is 2520
  println(divisibleByAllNumbersUpTo(20))

}
