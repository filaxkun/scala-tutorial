import scala.collection.mutable.ArrayBuffer

object Maps {
  def main(args: Array[String]): Unit = {

    // MAPS : store KEY-VALUE pair

    // IMMUTABLE maps
    val employees = Map("Manager" -> "Bob",
                        "Secretary" -> "Sus")

    if ( employees.contains("Manager"))
      printf("manag name: %s\n", employees("Manager"))


    // MUTABLE maps
    val customers = collection.mutable.Map(100 -> "Pollo smitto", 101 -> "Sasa")

    printf("custom 1: %s\n", customers(100))
    
    customers(102) = "quella li" //MUTABLE -> CAN ADD
    printf("custom mega: %s\n", customers(102))

    for( (k,v) <- customers )
      printf("%d : %s\n", k,v)

  }
}
