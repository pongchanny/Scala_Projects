object ConsonantsVowels{
  def main(args: Array[String]){
     println("Enter string: ");
    val str : String = scala.io.StdIn.readLine();
    
    //printing and counting the vowels
    var Vow: Int = 0;
    var Con: Int = 0;
    var Spa: Int = 0;
    var i: Int = 0;
    
    if(str(i) == 'a' || 'e' || 'i' || 'o' || 'u' || 'A' || 'E' || 'I' || 'O' || 'U')
    {
      for(i<-0 to (str.length-1))
      {
       val Vow = { var i = 0; () => { i += 1} }
      }
      println("There are" +Vow +"vowels");
    }
    else if(str(i) == " "){
      for(i<-0 to (str.length-1)){
        val Spa = { var i = 0; () => { i += 1} }
      }
    }
    println("There are " +Spa +"spaces");
    
    ;{
      val Con = { var i = 0; () => { i += 1} }
    }
    println("There are " +Con +"consonants");
  }
}