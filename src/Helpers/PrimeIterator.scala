package Helpers

import scala.math._

/**
 * Helper class for prime number problems
 */
class PrimeIterator extends Iterator[Int] {
  private var lastPrime = 1

  def hasNext = true

  def next() = {
    if (lastPrime < 3) {
      lastPrime += 1
    } else {
      var found = false
      while (!found) {
        lastPrime += 2
        found = isPrime(lastPrime)
      }
    }
    lastPrime
  }

  private def isPrime(num: Int) = {
    (2 to ceil(sqrt(num)).toInt + 1).forall(num % _ != 0)
  }
}
