package example.myapp

class Person(val firstName: String, val lastName: String) {
    val fullName: String
     get () {
         return "$firstName $lastName"
     }
}

fun main() {

    val person = Person("Jane", "Smith")
    println(person.fullName)

}
