package Problems

import scala.math.pow

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^^2 = 3025
 * Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 */
object Number6 extends App {

  def sumSquareDifference(num: Int) = {
    val range = 1 to num
    val sumOfSquares = range.map(i => i * i).sum
    val sumOfNumbersSquared = pow(range.sum, 2).toInt
    sumOfNumbersSquared - sumOfSquares
  }

  println(sumSquareDifference(10)) // Is 2640
  println(sumSquareDifference(100))

}
