import scala.collection.mutable.ArrayBuffer

object Arrayz {
  def main(args: Array[String]): Unit = {

    // ARRAYZ
    val favNumb = new Array[Int](20)
    val frenz   = Array("bob", "pap")

    println(favNumb(2),frenz(1))




    // ARRAY BUFF
    val frenzBuff = ArrayBuffer[String]()
    frenzBuff.insert(0, "paaan")
    frenzBuff.insert(1, "lle")

    //// ADD TO NEXT SPOT
    frenzBuff += "Makk"

    //// MULTI ADD
    frenzBuff ++= Array("sus", "pau")
    

    for( name <- frenz ) 
      println(name)
    
    for( name <- frenzBuff ) 
      println(name)


    // YIELD
    val frenzYelded = for ( num <- 1 to 99 if num%6==0 ) yield num 

    /*
    for( num <- frenzYelded )
      println(num)
    */
    
    //// NEW PRINT
    frenzYelded.foreach(println)
    
    var multTable = Array.ofDim[Int](10,10)

    for( i <- 0 to 9 ) {
      for( j <- 0 to 9) {
        multTable(i)(j) = i * j
      }
    }

    for( i <- 0 to 9 ) {
      for( j <- 0 to 9) {
        printf("%d * %d = %d\n",i,j,multTable(i)(j))
      }
    }

  }
}
