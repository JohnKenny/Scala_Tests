

object ClosureDemo {
  val num = 10
  val add = (x: Int) => {
    x + num
    
  }
  
  def main(args: Array[String]){
    
    println(add(10))
    println(num)
  }
}