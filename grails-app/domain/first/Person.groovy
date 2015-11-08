package first

class Person {
    String name
    Date birthDate
    byte[] photo

    static constraints = {
        name(blank: false)
        photo(maxSize: 1024*1024) //1 MB
    }
}
