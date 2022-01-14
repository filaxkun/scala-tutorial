object Cond {
  def main(args: Array[String]): Unit = {

    var age = 18

    val canVote = if (age >= 18) "Y" else "N"

    if ((age >= 9) && (age <=12)) { 
      println("mid") 
    } else if ((age >= 13) && (age <= 19)) {
      println("high")
    } else {
      println("uni")
    }

  } 
}
