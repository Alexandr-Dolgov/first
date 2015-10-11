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

    def getRandomTodayPerson() {
        def allTodayPersons = Person.findAll(
                "FROM Person as p WHERE day(p.birthDate)=day(:now) AND month(p.birthDate)=month(:now) ",
                [now: new Date()])
        def randomTodayPerson
        if (allTodayPersons.size() > 0) {
            def randomIndex = new Random().nextInt(allTodayPersons.size())
            randomTodayPerson = allTodayPersons[randomIndex]
        }
        return randomTodayPerson
    }
}
