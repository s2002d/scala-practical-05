object Q52 {

  case class Book(name: String, author: String, isbn: String)

  var lib: Set[Book] = Set()
  
  def addBook(book: Book): Unit = {
    lib += book
    println(book)
  }

 
  def removeBook(isbn: String): Unit = {
    lib = lib.filterNot(_.isbn == isbn)
    println(s"Book with ISBN '$isbn' removed.")
  }

  
  def searchByTitle(name: String): Unit= {
    println(lib.filter(_.name.toLowerCase.contains(name.toLowerCase)))
  }

  
  def searchByAuthor(author: String): Unit= {
    println(lib.filter(_.author.toLowerCase.contains(author.toLowerCase)))
    
  }


  def searchByIsbn(isbn: String): Unit = {
    println(lib.find(_.isbn == isbn))
  }

  
  def main(args: Array[String]): Unit = {
    val b1 = Book("Viramaya", "Mohan Samaradhasa", "b23456")
    val b2 = Book("Yuganthaya", "Martin Wicckramsingha", "b69771")
    val b3 = Book("Hathpana", "Kumarathunga Munidasa", "b76955")
    
    println("Books Informations...")
    addBook(b1)
    addBook(b2)
    addBook(b3)

    println("\nSearch by title 'Hathpana':")
    searchByTitle("Hathpana")

    println("\nSearch by author 'Mohan Samaradhasa':")
    searchByAuthor("Mohan Samaradhasa")

    println("\nSearch by ISBN 'b69771':")
    searchByIsbn("b69771")

    println("\nRemove book with ISBN 'b69771':")
    removeBook("b69771")

    println("\nLibrary after removal:")
    lib.foreach(println)
  }
}
