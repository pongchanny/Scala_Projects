//reverse of the concatenation
//odd value of the concatenation
//make a list of list
//convert list1 to string
//print all the elements of list3 except the last one
 object PrintListNum{
  def main(args: Array[String]){
    var list1 = List(12,43,23,65,34);
    var list2 = List(34,53,65,32,79);
    
    println("List1 and List2: ");println("----------------");
    println(list1);println(list2);
    
   //concatenate two lists
    println("List1 and List2 after concatenation:");
      var list3 = list1 ++ list2;
      println(list3);
      println("List3 after reverse:");
      list3.reverse;//reverse after concatenation
      println(list3.reverse);
   //print odd elements from list3
     println("The odd elements in List3:");
     var i= 0;
     for(i<-1 to list3(i))
        {
          if(list3(i)%2 != 0)
          {
            print(list3(i) +" ");
          }
        } 
   //make a list of list
       
    }
 }