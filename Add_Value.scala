package New_Paakage
//Adding two list
/*object Add_Value 
{
  def main(args: Array[String])
  {
    var list1 = List(23,45,67)
    var list2 = List(67,90,89,78)
    
    var list3 = list1 ::: list2 //::: using for connect two list
    print("After add value:"+list3)
  }
}*/

object Add_Value
{
  def main(args: Array[String])
  {
    var list1 = List(34,54,45,65)
    var list2 = List(23,24,25)
    var list3 = list1 ::: list2//add two list
    
    println("list3: "+list3)
    
    //reverse list
    var list_rv = list3.reverse
    println("After reverse: "+list_rv) 
    
    //print odd value
    var i = null
    for(i<- 0 to list_rv.length-1)
      if(list_rv(i)%2 == 1)
      {
        println("print odd value: "+list_rv(i))
      }
    
    //Make a list of list
    var allList = List(list1,list2,list3)
    println("After make list of list: "+allList)
    
    //Convert list1 to string
    println("After convert list to string: "+list1.mkString)
    
    //All elements of list3 except the last value
    println("After cut the last value: "+list3.init)
    
    //All elements of list3 except the first value
    println("After cut the first value "+list3.tail)
  }
}










