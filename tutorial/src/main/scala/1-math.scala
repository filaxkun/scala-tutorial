object Arith {
  def main(args: Array[String]): Unit = {

    import scala.math._

    println( 
      5%4 , 
      abs(-1) , 
      cbrt(8) , //cube root
      ceil(5.49)  ,
      floor(5.49) ,
      round(5.45) ,
      exp(1)   ,
      pow(2,3) ,
      sqrt(99) ,
      min(1, 88) ,
      max(1, 88)
    )

    val rando = (random * (11 - 1) + 1).toInt //rando 1 - 10
    println(rando)
  } 
}
