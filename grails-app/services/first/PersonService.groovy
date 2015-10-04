package first

import grails.transaction.Transactional

@Transactional
class PersonService {
    def getStaticPerson() {
        return new Person(name: "Вася", birthDate: new GregorianCalendar(1998, 0, 25).time)
    }

    def getRandomPerson() {
        def allPerson = Person.list()
        def randomPerson
        if (allPerson.size() > 0) {
            def randomIndex = new Random().nextInt(allPerson.size())
            randomPerson = allPerson[randomIndex]
        } else {
            randomPerson = getStaticPerson()
        }
        return randomPerson
    }
}
