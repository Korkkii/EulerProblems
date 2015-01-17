package Problems

import scala.math._

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
object Number3 extends App {

  def findLargestPrimeFactor(number: Long) = {
    val range = 2 to ceil(sqrt(number)).toInt + 1

    def isPrime(num: Long) = {
      (2 to ceil(sqrt(num)).toInt + 1).forall(num % _ != 0)
    }

    range.foldLeft(1)((highest, next) =>
      if (number % next == 0 && isPrime(next) && next > highest) next else highest)

  }

  println(findLargestPrimeFactor(13195)) // Is 29
  println(findLargestPrimeFactor(330)) // Is 11
  println(findLargestPrimeFactor(600851475143L))


}
