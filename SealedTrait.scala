// Definition of shield trait
sealed trait Animal

// The shield trait can only be inherited in this file
case class BirdAnimal() extends Animal
case class CatAnimal() extends Animal
case class DogAnimal() extends Animal

object SealedTrait extends App {

    // A function that uses a shield trait for pattern matching
    def bark(a: Animal): Unit = a match {
        // It is necessary to cover the case class that inherits the shield trait
        case BirdAnimal() => println("Chirp-chirp")
        case CatAnimal() => println("Mew-mew")
        case DogAnimal() => println("Bow-wow")
    }

    val bird = new BirdAnimal
    bark(bird)
    val cat = new CatAnimal
    bark(cat)
    val dog = new DogAnimal
    bark(dog)

}


// =====================================
//         Output Sample
// =====================================
// $ scalac SealedTrait.scala 
// $ scala SealedTrait
// Chirp-chirp
// Mew-mew
// Bow-wow