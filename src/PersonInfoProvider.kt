interface PersonInfoProvider {
    fun printInfo(person: Person)
}

open class BasicInfoProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person(firstName = "Iyanuoluwa"))
}