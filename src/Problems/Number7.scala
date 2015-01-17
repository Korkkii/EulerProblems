package Problems

import Helpers.PrimeIterator

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
object Number7 extends App {

  def nthPrime(n: Int) = {
    val primeIterator = new PrimeIterator
    primeIterator.drop(n - 1).next()
  }

  println(nthPrime(10001))

}
