// Definition of shield class
sealed abstract class Animal

// The shield class can only be inherited in this file
case class BirdAnimal() extends Animal
case class CatAnimal() extends Animal
case class DogAnimal() extends Animal

object SealedClass extends App {

    // A function that uses a shield class for pattern matching
    def bark(a: Animal): Unit = a match {
        // It is necessary to cover the case class that inherits the shield class
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
// $ scalac SealedClass.scala 
// $ scala SealedClass
// Chirp-chirp
// Mew-mew
// Bow-wow