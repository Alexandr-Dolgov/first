package first

class Person {
    String name
    Date birthDate

    static constraints = {
        name(blank: false)
        birthDate(nullable: false)
    }
}
