package org.example


fun main() {

    val car1: Car = Car(
        "Green",
        250,
        "Audi",
        90,
    )
    val car2 = Car("Red",199,"Skoda", 50)
    val car3 = Car("Blue", 239,"BMW",120)
    val car4 = Car(color = "Green", power = 199, brand = "Reno", tankVolume = 100)
    val car5 = Car(color = "Red", power = 239, brand = "Skoda", tankVolume = 125)
    val car6 = Car(color = "Black", power = 222, brand = "Porsche", tankVolume = 666)

    val fuel92 = Fuel(92, "Fuel")
    val fuel95 = Fuel(95,"Fuel")
    val fuel100 = Fuel(100,"Fuel")
    val diesel = Diesel( "Diesel")

    val brat1 = Brat("Kakan")
    val brat2 = Brat("Babuin")
    val brat3 = Brat("Rotan")
    val brat4 = Brat("Macan")

    val zaprvka = 100
//    val squirt: Animal = Animal(
//        weight = 1,
//        height = 10,
//        width = 1,
//        name = "pidr",)
//
//    val wolf = Animal(weight = 123, height = 22, width = 2, name = "gay")
//    val croc = Animal(weight = 666, height = 55, width = 8,  name = "slayer")
//
//    val weightSquirt = squirt.weight //вес белки
//    println(weightSquirt)
//    val heightSquirt = squirt.height //высота белка
//    println(heightSquirt)
//    val animalWeight = squirt.weight + wolf.weight	+ croc.weight
//    println(animalWeight)
//
//    val animals: List<Animal> = listOf(squirt,wolf,croc)
//    println(animals[2].name)
//
//    val meat = Eat(weight = 10, smell = "Blood", name = "meat")
//    val koko = Trap("maks",  "pavel", "triger")
//    croc.square()
//    squirt.square()
//    croc.perdit(meat ,koko, wolf)
    car1.refuel(car1, fuel95, brat3)
    car2.refuel(car2, fuel92 , brat2)
    car3.refuel(car3, fuel100, brat1)
    car4.refuel(car4, fuel92, brat3)
    car5.refuel(car5, fuel95, brat1)
    car6.refuel(car6, fuel100, brat4)
}
class Car (
    val color: String,
    val power: Int,
    val brand: String,
    val tankVolume: Int,
)

{
    fun introduce() {
        println("My color is $color")
        println("My power is $power")
        println("My brand is $brand")
    }
//    fun square(): Int {
//        return height * width
//    }
//    fun perdit(eda: Eat, dick: Trap, curve: Animal) { // fun - объявление функции perdit - название функции eat - аргумент Eat - тип
//        println("I have $brand ate ${eda.name} and smells like ${eda.smell} i think its ${dick.gay} but i need to know ${curve.square()}")
//    }
    fun refuel(whichCar: Car, whichFuel: Fuel, brotherName: Brat){
        val zapravka = 100
        val bratskoeSerdce = "Macan"
        if (zapravka >= whichCar.tankVolume || bratskoeSerdce == brotherName.name){
        println("Priehala mashina ${whichCar.brand} ee need refuel ${whichFuel.on} ${whichFuel.type}, a how much tebe zalit' brat ${brotherName.name} BROTHER? Mne do Full brat ${whichCar.tankVolume}")
    } // смысл в том что брат Макан даже при условии что заправка 100 все равно заправит себе полный бак
    else {
        println("huy") // а его ебучий брат Какан так не может, ну конечно он же Какан
    }


    }
} // Добавить функцию IF, if statment in Kotlin!!
class Fuel( // название типа/класса
    val on: Int,
    val type: String,
)
class Diesel( // название типа/класса
    val type: String,
)
class Brat(
    val name: String,
)