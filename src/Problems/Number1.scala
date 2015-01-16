package Problems

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Number1 extends App {
  def sumOfMultiples(multiples: Set[Int], max: Int): Int = {
    (1 until max).filter(num => multiples.exists(num % _ == 0)).sum
  }

  // For the given case
  println(sumOfMultiples(Set(3, 5), 10))

  // For the unknown case
  println(sumOfMultiples(Set(3,5), 1000))
}
