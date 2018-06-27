

object Sample3 {
  //a number that is divided by 3 is foo
   //a number that is divisible by 5 is bar
   //both is called foobar
  def main(args: Array[String])
  { 
    for(i <-1 to 20)
    {
      case 1 => i/3=0
      {
        println(i +"is foo!");
      }
      case 2 => i/5=0
      {
        println(i +"is bar!");
      }
      case 3 => i/3=0 || i/5=0
      {
        println(i +"is foobar!");
      }
    } 
  }
}