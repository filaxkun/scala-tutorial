import scala.math._

object MappingFunc {
  def main(args: Array[String]): Unit = {

    val log10Func = log10 _ 

    println("log di 1k " + log10Func(1000))
    println("log di 100k " + log10Func(100000))

    // apply to LIST
    List(1.0, 10.0, 100.0, 1000.0).map(log10Func).foreach(println)
    List(1,3,5,9).map( (x : Int) => x * 7).foreach(println)


    // FILTER
    // only get even numb
    List(1,2,3,4,5,6).filter(_ % 2 == 0).foreach(println)

  } // END main
}
