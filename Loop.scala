package New_Paakage

//scala For loop by using to Keyword
/*object Loop 
{
  def main(args: Array[String])
  {
    for(i<-0 to 10)
      println(i)
  }
}

//scala For loop by using until keyword
object Loop
{
  def main(args: Array[String])
  {
    for(i<-0 until 10)
      println(i)
  }
}*/

//scala For loop by using filtering
/*object Loop
{
  def main(args: Array[String])
  {
    for(i<-1 to 10 if(i%2==0))
    println(i)
  }
}*/

//scala For loop by using yield keyword*/
/*object Loop
{
  def main(args: Array[String])
  {
    var result = for(i<-0 to 8) yield i
    for(a<-result)
    {
      println(a)
    }
  }
}*/

//scala for loop by using collection list
/*object Loop
{
  def main(args: Array[String])
  {
    var list = List(3,4,5,6,7,8,9,10)
    for(a<-list)
    {
      println(a)
    }
  }
}*/

//scala for loop using by keyword
/*object Loop
{
  def main(args: Array[String])
  {
    for(a<- 1 to 10 by 2)
      println(a)
  }
}*/
/*object Loop
{
  def main(args: Array[String])
  {
    print("Enter the number: ")
    var num:Int = scala.io.StdIn.readInt();
    var i:Int =0
    for(i<- 0 to num if(i%4 != 0))
      print(i+" ")
  }
}*/

object Loop
{
  def main(args: Array[String])
  {
    print("Enter the number: ")
    var i:Int = scala.io.StdIn.readInt()
    while (i!= -1)
    {
      print(i+ " ")
      i -= 1
    }
  }
}





















