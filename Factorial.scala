
object factorial{
  def main(args: Array[String]){
      //println("Enter the number to do factorial: ");
      var sum:Int = 1; var num: Int = 5;
      println("The factorial of "+num + " is:");
      for(i <- 0 to 4)
      {
       sum=sum*(num-i);
      }
       println(sum);
  }
}

//object fact{
//  def main(args: Array[String])
//  {
//    var num = 
//  }
//}