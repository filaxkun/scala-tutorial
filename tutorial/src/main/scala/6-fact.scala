object Fact {
  def main(args: Array[String]): Unit = {

    def fact ( num : Int ) : BigInt = {
      if ( num <= 1 ) 
        1
      else
        num * fact(num-1)
    }

    val n = 5

    println("fact " + n + " is " + fact(n))
  }
}
