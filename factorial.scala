

object factorial 
{
  def main(args: Array[String])
  {
      var i: Int = 1
      var sum : Int = 1
      print("Enter any number : ")
      var num = scala.io.StdIn.readInt()
      for(i <- 1 to num)
      sum = sum * i
      println(num+"! is = "+sum)
  }
} 
/*var num = fact(5)
    println(num)
  }
  def fact (num : Int): Int =
  {
    if (num ==1)
      return 1;
    else
      return num*(fact(num-1))
  }
}*/
