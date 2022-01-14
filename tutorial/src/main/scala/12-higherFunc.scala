import scala.math._

object HigherLevFunc {
  def main(args: Array[String]): Unit = {

    def times3( num : Int ) = num * 3
    def times2( num : Int ) = num * 2

    //                 receive   return
    def multInt( func : (Int) => Double, num : Int ) = {
    // Gonna receive: a func, a numb
      func( num )
    }

    printf("3 * 100 = %f\n", multInt( times3, 55 ))
    printf("2 * 100 = %f\n", multInt( times2, 55 ))



    // CLOSURE
    val divisorVal = 5 // depend on value stored outside (?)
    val divisor5 = ( num : Double ) => num / divisorVal
    println("5/5 = " + divisor5(69.0))


    ////////////////////////////////////////////////////////////
    //
    // EXCEPTION
    def divNumz( num : Int, den : Int ) = try {
      (num / den)
    } catch {
      case ex : java.lang.ArithmeticException => "nope - div by zero"
    } finally {
      // clean up after exception
      println("change den")
    }

    println("3 / 0 = " + divNumz(3,0))

  } // END main
}
