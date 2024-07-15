object Q1 {
  def main(args: Array[String]): Unit = {
    val list = getProductList()
    display(list)
    getCount(list)
    
  }

  def getProductList(): List[String] = {
    var li = List.empty[String]
    var pn = ""

     while (pn != "done"){
      print("Enter Product name (Enter 'done' to finish): ")
      pn = scala.io.StdIn.readLine()
      if (pn != "done") {
        li = li :+ pn  
      }
    }

    li
  }

  def display(li: List[String]):Unit={
    println(li)

  }

  def getCount(li: List[String]): Unit = {
    val count = li.length
    println(count)
  }
}
