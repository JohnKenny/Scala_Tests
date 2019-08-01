/*
 * Currying: transform a function that takes many arguments into
 * one that takes a single argument.
 */

object Currying {
  def add(x: Int, y: Int) = x + y

  def add2(x: Int) = (y: Int) => x + y
  
  def add3 (x : Int) (y : Int) = x + y

  def main(args: Array[String]) {
    println(add(12, 10))

    println(add2(12)(10))
    val sum40 = add2(40)
    println(sum40(100))
    println(add3(100)(150))
    val sum50 = add3(50)_
    println(sum50(150))
  }
}