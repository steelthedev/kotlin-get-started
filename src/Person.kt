class Person(val firstName: String = "John", val lastName: String = "Doe") {
    var nickName: String? = null


    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println(lastName)
        println(firstName)
        println(nickNameToPrint)
    }
}