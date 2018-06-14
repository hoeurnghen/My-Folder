
/*import scala.util.control.Breaks._
object Break 
{
  def main(args: Array[String])
  {
  breakable
    {
      for(i <- 1 to 10 by 2)
      {
        if(i==7)
          break
        else
          println(i)
      }
    }
  }
}*/
object Fibonacci
{
  def main(a: Array[String])
  {
    var v = 0;
    var term1 = 0;
    var term2 = 1;
    var sum = 0
    for(i <- 1 to 20)
    {
      print(term1 +" ");
      sum=term1+term2;
      term1 = term2;
      term2 = sum;
    }
  }
}
