object Basics {
  def main(args: Array[String]): Unit = {

    // variable - CAN CHANGE
    var num = 10 + 2 * 11 / 7
    // constant - CAN'T CHANGE
    val lvl = 99
    println(num, lvl)

    /* ALL TYPES ARE OBJ */
    // Byte : -128 / +127
    // Bool : true / false
    // Char : unsigned max val 65535
    // Short: -32768 / +32767 (16 bit)
    // Int  : -2147483648 / +2147483647 (32 bit)
    // Long : -922337303... (64 bit)
    // Float : -3.402e38 / +3.402e38 (32 bit)
    // Double: -1.79e308 / +1.79e308 (64 bit)

    // BIG INT
    var biggy = BigInt("999999999999999999999999999999999")
    // BIG DEC
    val bigpi = BigDecimal("3.141592653589793238462643383279502884")
    println(biggy,bigpi)
    
    biggy +=1
    println(biggy)
  }
}
