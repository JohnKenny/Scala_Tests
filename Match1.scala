

object Match1 {
  def main(args: Array[String]){
    val age = 20 
    val i = 4
    age match {
      case 20 => println(age)
      case 19 => println(age)
      case 30 => println(age)
      
      case _ => println("no match found")
    }
    
    val result = age match {
      case 20 => age
      case 19 => age
      case 30 => age
      
      case _ => println("no match found")
    }
    
    println(s"$result\n")
    
    i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
  }
  }
  
  
  
  
  
}