import scala.collection.mutable.ArrayBuffer

object Classes {
  def main(args: Array[String]): Unit = {

    val ciro = new Animal("ciro","bumbum")
    val buh  = new Animal("puf")
    val anon = new Animal //()

    //printf("%s (id: %d) fa %s\n",ciro.getName, ciro.id, ciro.getSound)
    printf(s"${ciro.getName} (id: ${ciro.id}) fa ${ciro.getSound}\n")
    printf("%s (id: %d) invece fa...%s\n", buh.getName, buh.id, buh.toString)

    val spike = new Dog("spike","bumbum","grrr")
    val zazo  = new Dog("zazo")
    val adog  = new Dog //()

    //printf("%s (id: %d) fa %s\n",spike.getName, spike.id, spike.getSound)
    printf(s"${spike.getName} (id: ${spike.id}) fa ${spike.getSound}\n")
    printf("%s (id: %d) invece fa...%s\n", zazo.getName, zazo.id, zazo.toString)

    val doko = new Wolf("doko")
    printf(s"${doko.move}\n")


    val catena = new Ciccione("cirocatena")
    printf(s"${catena.fly}\n")
    printf(s"${catena.fart}\n")

  } // END main
  

  class Animal( var name: String, var sound: String) {
    this.setName(name)
    // DEFAULT CONSTRUCTOR above
    
    val id = Animal.newIdNum // STATIC function

    //protected  only by THIS CLASS and SUB CLASS
    //private    only by THIS

    def getName()  : String = name
    def getSound() : String = sound

    def setName( name : String ) {
      if( !(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No name"
    }

    def setSound( sound: String ) {
      this.sound = sound
    }


    /////// CREATING OTHER CONSTRUCTORS
    def this( name: String ){
      this("No name","No sound")
      this.setName(name)
    }

    def this(){
      this("No name","No sound")
    }

    ////// OVERRIDE METHODS
    override def toString() : String = {
      return "Vorresti! Merdaccia chiamata %s\n".format(this.name)
    }
  }

  ///// COMPANION OBJ ////
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber }
  }

  ////////////////////////////////////////////////////////////////
  
  /// INHERITANCE
  //  quando erediti perdi l'accesso DIRETTO >> this.qualcosa X

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this( name: String, sound: String){
      this("No name", sound, "woof")
      this.setName(name)
    }

    def this( name: String){
      this("No name", "No sound", "woof")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound", "woof")
    }

    // END OF CONSTRUCTORZ

    ////// OVERRIDE METHODS
    override def toString() : String = {
      //return "Vorresti! Cagnaccio chiamato %s\n".format(this.name)
      return "Vorresti! Cagnaccio chiamato %s\n".format(this.getName)
    }
  }

  ////////////////////////////////////////////////////////////////
  // ABSTRACT
  
  abstract class Mammal(val name : String){
    // ABSTRACT field - NO VALUE ASSIGNED
    var moveSpeed : Double

    // ABSTRACT func - NO METHOD BODY
    def move : String
  }

  class Wolf(name : String) extends Mammal(name){
    var moveSpeed = 99
    def move = "This fkin woof named %s is going over %f\n".format(this.name, this.moveSpeed)
    }
  
  
  ////////////////////////////////////////////////////////////////
  // TRAITS - a class can extend multiple classes (like a java interface) 
  //        - CAN provide CONCRETE methods and field
  
  trait Flyable {
    def fly : String
  }

  trait Fartable {
    def fart : String

    def fart( speed : Double ) : String = {
      "fart going at the speed of %.1f\n".format(speed)
    }
  }

  class Ciccione( val name : String ) extends Flyable with Fartable {
    def fly  = "%s can fly".format(this.name)
    def fart = "%s is farting and %s".format(this.name, this.fart(99))
  }

}
