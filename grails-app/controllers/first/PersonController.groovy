package first

import java.text.SimpleDateFormat

class PersonController {
    def scaffold = true

    static defaultAction = "show"

    def personService

    def show() {
        Person randomPerson = personService.getRandomPerson()
        return [
                name: randomPerson.name,
                birthDate: new SimpleDateFormat("dd.MM.YYYY").format(randomPerson.birthDate)
        ]
    }

    def demo() {
        render "<h1>demo</h1>"
    }
}
