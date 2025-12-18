package org.example


fun main() {

    val squirt: Animal = Animal(
        weight = 1,
        height = 10,
        width = 1,
        name = "pidr",)

    val wolf = Animal(weight = 123, height = 22, width = 2, name = "gay")
    val croc = Animal(weight = 666, height = 55, width = 8,  name = "slayer")

    val weightSquirt = squirt.weight //вес белки
    println(weightSquirt)
    val heightSquirt = squirt.height //высота белка
    println(heightSquirt)
    val animalWeight = squirt.weight + wolf.weight	+ croc.weight
    println(animalWeight)

    val animals: List<Animal> = listOf(squirt,wolf,croc)
    println(animals[2].name)

    val meat = Eat(weight = 10, smell = "Blood", name = "meat")
    val koko = Trap("maks",  "pavel", "triger")
    croc.square()
    squirt.square()
    croc.perdit(meat ,koko, wolf)

}
class Animal(
    val weight: Int,
    val height: Int,
    val width: Int,
    val name: String,
)

{
    fun introduce() {
        println("My name is $name")
        println("My width is $width")
        println("My weight is $weight")
        println("My height is $height")
    }
    fun square(): Int {
        return height * width
    }
    fun perdit(eda: Eat, dick: Trap, curve: Animal) { // fun - объявление функции perdit - название функции eat - аргумент Eat - тип
        println("I have $name ate ${eda.name} and smells like ${eda.smell} i think its ${dick.gay} but i need to know ${curve.square()}")
    }

}
class Eat( // название типа/класса
    val weight: Int,
    val smell: String,
    val name: String,
)

class Trap(
    val gay: String,
    val nigger: String,
    val trigger: String,
)