package first

import java.text.SimpleDateFormat

class PersonController {
    def scaffold = true

    static defaultAction = "showRandomTodayPerson"

    def personService

    def showRandomPerson() {
        Person person = personService.getRandomPerson()
        return [
                name: person.name,
                birthDate: new SimpleDateFormat("dd.MM.YYYY").format(person.birthDate)
        ]
    }

    def showRandomTodayPerson() {
        Person person = personService.getRandomTodayPerson()
        return [
                name: person?.name,
                birthDate: (person) ? new SimpleDateFormat("dd.MM.YYYY").format(person.birthDate) : null
        ]
    }

    def demo() {
        render "<h1>demo</h1>"
    }
}
