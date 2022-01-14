object Loops {
  def main(args: Array[String]): Unit = {

    var i = 0

    while (i < 10) {
      println("while " + i)
      i += 1
    }

    i = 0
    do {
      println("do-while " + i)
      i += 1
    }while (i<= 10)

    i = 0
    for( i <- 1 to 10)
      println("for " + i)

    val alphab = "ABCDEF"
    for( i <- 0 until alphab.length)
      println(alphab(i))

    val alist = List(1,2,3,4,5,99)
    for( i <- alist) {
      println("lista " + i)
    }

    val evenlist = for { i <- 1 to 20 if ( i%2 ) == 0 } yield i
    for( l <- evenlist )
      println(l)

    for( x <- 1 to 5; y <- 6 to 10) {
      println(x,y)
    }

  } 
}
