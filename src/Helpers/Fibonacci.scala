package Helpers

import scala.collection.mutable

/**
 * Helper class for Fibonacci sequence problems
 */
class Fibonacci extends Iterator[Int] {
  private val buffer = mutable.Buffer(0, 1)
  private var i = 0

  def hasNext = true

  def upTo(max: Int) = {
    var n = buffer.last
    while (n < max) {
      n = next()
    }
    buffer.init.toArray
  }

  def next() = {
    val result = buffer(i) + buffer(i + 1)
    buffer += result
    i += 1
    result
  }
}
