# Scala Sealed

## Sealed
Sealed class/trait can only be inherited within the same file.  

## Sealed class sample
```Scala
sealed abstract class Animal

case class BirdAnimal() extends Animal
case class CatAnimal() extends Animal
case class DogAnimal() extends Animal
```
## Sealed trait sample
```Scala
sealed trait Animal

case class BirdAnimal() extends Animal
case class CatAnimal() extends Animal
case class DogAnimal() extends Animal
```
