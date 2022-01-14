import scala.collection.mutable.ArrayBuffer

object Tuples {
  def main(args: Array[String]): Unit = {

    // TUPLE : IMMUTABLE
    val tupleFren = (420, "Fren", 69)
    /////////////    ._1   ._2   ._3
    printf("the magic number for %s is %d\n",tupleFren._2, tupleFren._3)


    // print ALL
    tupleFren.productIterator.foreach{ i => println(i) } //.toString()
  }
}
