Object PrintingNumNotMultipleTwo{
  def main(arg: Array[String]){
    for(i<- 0 to 20)
    {
      if(i%2 != 0)
      {
        println(i);
        }
    }
  }

  def main(args: Array[String]){
    var num: Int  = scala.io.StdIn.readInt();
    var i: Int = 0;
    for(i<- 0 to num){
      if(i%4 != 0){
        print(i + " ");
      }
    }
  }




































