import java.util.Date

object Partial_Demo {
  
  def log(date: Date, msg: String) = {
    println(s"$date $msg")
  }
  
  def main(args: Array[String]){
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    
    val f = sum(10, 20, _: Int) // partially applied function
    
    println(f(30))
    
    val date = new Date
    val newLog = log(date, _:String)
    newLog("1st message")
  }
}