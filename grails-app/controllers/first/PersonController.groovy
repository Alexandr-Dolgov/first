package first

import first.gorm.Color
import first.gorm.Material
import first.gorm.Vertex

import java.text.SimpleDateFormat

class PersonController {
    def scaffold = true

    static defaultAction = "showRandomPerson"

    def personService

    def showRandomPerson() {
        Person person = personService.getRandomPerson()
        return [
                name: person.name,
                birthDate: new SimpleDateFormat("dd.MM.YYYY").format(person.birthDate),
                photo: person.photo.encodeAsBase64()
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

    def gorm() {
        println 'start gorm'

        /*
        def v1 = new Vertex(x:1, y:2, z:3)
        v1.save()
        v1.get(1)
        v1.read(1)
        v1.load(1)
        */

        def coal = new Material(name: 'уголь', color: new Color(r: 0, g: 0, b: 0))
        coal.save()

        def silver = new Material(name: 'серебро', color: new Color(r: 192, g: 192, b: 192))
        silver.save()

        //между матераилом и цветом композиция 1:1.
        // У каждого нового материала новый объект цвет, при этом значение цвета не обязательно должно быть уникальным.
        def graphite = new Material(name: 'графт', color: new Color(r: 0, g: 0, b: 0))
        graphite.save()

        //удаляется материал, удаляется и цвет, потомучто композиция, потомучто Color belongsTo Material
        coal.delete()

        println 'finish gorm'
    }
}
