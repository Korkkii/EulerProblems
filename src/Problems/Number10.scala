package Problems

import Helpers.PrimeIterator

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
object Number10 extends App {

  def sumOfPrimesBelow(max: Long) = {
    val primeIterator = new PrimeIterator
    sum(primeIterator.takeWhile(_ < max))
  }

  def sum(iter: Iterator[Int]) = {
    var result = 0L
    while (iter.hasNext) {
      result += iter.next().toLong
    }
    result
  }

  println(sumOfPrimesBelow(10L)) // Is 17
  println(sumOfPrimesBelow(2000000L))
}
