object Subject_Score {
  def main(args: Array[String])
  {
    var StudentA = Array(5, 6, 20, 35);
    var StudentB = Array(10, 6, 25, 44);
    
    print(" ");
    println("  " +"S" +"  " +"J" +"  " +"X" +"  " +"Y");
    
    print("A");
    for(i<-0 to 3){
      print(" "+ StudentA(i) +" ");
    }
    println("");
    
    print("B");
    for(i<-0 to 3){
      print(" " +StudentB(i) +" ");
    }
    println("");
    
    for(i<-0 to 3)
    {
      if(StudentA(i) != StudentB(i))
      {
        print(" ");
        print(" "+ "1.0" + "");
      }
      else{
        print(" ");
      }
    }
  }
}