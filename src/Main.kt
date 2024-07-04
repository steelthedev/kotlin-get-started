fun sayGreeting(greeting: String, vararg itemToGreet: String) {
    itemToGreet.forEach { item ->
        println("$greeting $item")
    }
}

fun greetPerson(name: String, greeting: String) = println("$greeting $name")

fun main() {
    val person = Person(firstName = "Iyanuoluwa", "Ayomiposi")
    person.nickName = "manofsteel"
    person.printInfo()
}