import Array._

object Arrays1 {
  val myArray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Int](5)
  val myArray3 = Array(1, 2, 3, 4)

  def main(args: Array[String]) {
    myArray(0) = 4
    myArray(1) = 2
    myArray(2) = 3
    myArray(3) = 6

    for (x <- myArray){
      println(x)
    }
      
    for(i <- 0 to (myArray.length -1)) {
      println(myArray(i))
    }
    println(myArray3.length)

    val result = concat(myArray, myArray3)
    for(x <- result){
      println(x)
    }
      
    println()
    println()
    println()
  }
}