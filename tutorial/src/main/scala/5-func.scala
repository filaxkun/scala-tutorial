object Func {
  def main(args: Array[String]): Unit = {

    // def funcName ( param1: dataType, param2: datatype ) : returnType = {
    //    - function body -
    //    return VAL
    // }

    def getSum ( num1: Int = 0, num2: Int = 1 ) : Int = {
      //return num1 + num2
      num1 + num2 // RETURN NOT NEEDED
    }

    println("5 + 2 = " + getSum(5,2))
    println("1 + 8 = " + getSum(num2=8,num1=1))

    // PROCEDURES - do not return stuff
    def sayASD() : Unit = {
      println("ASD")
    }

    sayASD

    def getSuperSum ( args: Int* ) : Int = {
      var sum : Int = 0
      for( num <- args ) {
        sum += num
      }
      sum
    }

    println("Supersum = " + getSuperSum(1,2,4,1,2,5))
  } 
}
