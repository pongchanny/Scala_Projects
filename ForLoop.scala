

object Sample2 {
   //main function
  def main(args: Array[String])
  {
    var i = 0;
    
    //Using for loop to print from 1 to 10
    for(i<-1 to 10)
    {
      println(i);//print number 1 to 10
    }
    //using for loop & if condition to print numbers not divisible by 3
    print("The number not divisible by 3\n");
    for(i <- 1 to 10)//condition from 1 to 10
    {
       if(i%3!=0) 
        {
          println(i);//print number not divisible by 3
        }
    }
  }
}