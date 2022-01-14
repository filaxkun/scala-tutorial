object Break {
  def main(args: Array[String]): Unit = {

    def printPrimes() {
      val primeList = List(1,2,3,5,7,11)
      for( i <- primeList ) {
        println(i)
        if( i == 7 ) {
          return
        }
      }
    }

    printPrimes
    
  } 
}
