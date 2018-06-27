//LibraryList
//CategoryList
//BookList
//PageList
//LineList
object Flat_List {
  def main(args: Array[String]){
    //print out lineList
    var Linelist = List(90, 89, 87);
    var Pagelist = List(39, 56, 75);
    var Booklist = List(54, 45);
    var Categorylist = List(20, 23);
    
    var Librarylist = List(Categorylist, Booklist, Pagelist, Linelist).flatten;
    println("List after flattening: "); println(Librarylist);
  }
}