
fun main() {

    val car1: Vehicle = Vehicle(
        color = "Green", power = 250, brand = "Audi", tankVolume = 90, name = "Kakan", typeICE = FuelType.Petrol
    )
    val car2 = Vehicle(
        color = "Red", power = 199, brand = "Skoda", tankVolume = 50, name = "Babuin", typeICE = FuelType.Petrol
    )
    val car3 =
        Vehicle(color = "Blue", power = 239, brand = "BMW", tankVolume = 120, name = "Rotan", typeICE = FuelType.Petrol)
    val car4 = Vehicle(
        color = "Green", power = 199, brand = "Reno", tankVolume = 100, name = "Narotan", typeICE = FuelType.Diesel
    )
    val car5 = Vehicle(
        color = "Red", power = 239, brand = "Skoda", tankVolume = 125, name = "Vrotan", typeICE = FuelType.Diesel
    )
    val car6 = Vehicle(
        color = "Black", power = 222, brand = "Porsche", tankVolume = 666, name = "Macan", typeICE = FuelType.Electro
    )
    val Fuel92 = Fuel(
        on = 92,
        type = FuelType.Petrol,
        price = 60
    )
    val Fuel95= Fuel(
        on = 95,
        type = FuelType.Petrol,
        price = 67
    )
    val Fuel100= Fuel(
        on = 100,
        type = FuelType.Petrol,
        price = 90
    )
    val Diesel= Fuel(
        on = 0,
        type = FuelType.Diesel,
        price = 80
    )
    val Electro= Fuel(
        on = 0,
        type = FuelType.Electro,
        price = 0 // субсидии хули
    )

//    fun refuel(whichCar: Car, whichFuel: Fuel, brotherName: Brat) {
//        val zapravka = 100
//        val bratskoeSerdce = "Macan"
//        if (zapravka >= whichCar.tankVolume || bratskoeSerdce == brotherName.name)
//            println("Priehala mashina ${brand} ee need refuel ${whichFuel.on} ${whichFuel.type}, a how much tebe zalit' brat ${brotherName} BROTHER? Mne do Full brat ${whichCar.tankVolume}") // смысл в том что брат Макан даже при условии что заправка 100 все равно заправит себе полный бак
//        else {
//            println("huy") // а его ебучий брат Какан так не может, ну конечно он же Какан
//        }
//    }
    car1.refuel(Fuel92, skoka = 80)
    car2.refuel(Fuel95, skoka = 120)
    car3.refuel(Fuel100, skoka = 150)
    car4.refuel(Fuel92, skoka = 10)
    car5.refuel(Diesel, skoka = 15)
    car6.refuel(Electro, skoka = 999)


} // Добавить функцию IF, if statment in Kotlin!!

class Vehicle(
    val color: String,
    val power: Int,
    val brand: String,
    val tankVolume: Int,
    val name: String,
    val typeICE: FuelType, // Petrol - Fuel type, Diesel - Diesel type, 2 - Electro type
) {
    fun introduce() {
        println("My color is $color")
        println("My power is $power")
        println("My brand is $brand")
        println("My tankVolume is $tankVolume")

    }

    fun refuel(zapravka: Fuel, skoka: Int) {
        println("111") // нада потом сделать чтобы он выводил номер машины car1 car2 car3, разобраться как это сдедать
        val Jet = "Macan"
        if ((skoka <= tankVolume || Jet == name) && typeICE == zapravka.type) // смысл в том что брат Макан даже при условии что заправка 100 все равно заправит себе полный бак
        {
            println("Ia refuel ${brand} this fuel ${zapravka.type} i zaplatil ${skoka * zapravka.price} Mao, thanks for refuel on our gas station brother, JET USHEL JET")
        } else if (skoka >= tankVolume && typeICE == zapravka.type) {
            println("Ti dolbaeb razlil benz ${(skoka - tankVolume)} litrov, budesh teper platit sverhu za razlitoe ${(skoka - tankVolume) * zapravka.price}, i davay otsuda JAB USHEL JAB") // а его ебучий брат Какан так не может, ну конечно он же Какан
        } else if (typeICE != zapravka.type) {
            println("Idi nahuy ti svoe dviglo videl 4ert zhi est")
        } else {
            println("Prosto idi nahuy")
        }
    }
}

enum class FuelType {
    Petrol, Diesel, Electro
}
class Fuel(
    val on: Int,
    val type: FuelType,
    val price: Int
)


//class Diesel(
//    // название типа/класса
//    val type: String
//)
