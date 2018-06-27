

object Sample1 {
  def main(args: Array[String])
  {
    var i = 0;
    println(i);
    println("--------------------");
    
    println("Scala is scalalala!");   
    println("---------------------");
    println("Enter the number to check: ");
    var input  = scala.io.StdIn.readInt();
    var num= 0;
    for(num<-1 to 10)
    {
      println(input + "*" + num + "=" + (input*num));
    }
    
  }
}