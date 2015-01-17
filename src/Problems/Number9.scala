package Problems

import scala.math.pow

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c**2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5**2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
object Number9 extends App {

  def findTripletProduct(sum: Int) = {
    for {
      a <- 0 to 1000
      b <- (a + 1) to 1000 // b > a
      c <- (b + 1) to 1000 // c > b
      if pow(a, 2) + pow(b, 2) == pow(c, 2) && (a + b + c) == sum
    } yield a * b * c
  }

  println(findTripletProduct(1000))

}
