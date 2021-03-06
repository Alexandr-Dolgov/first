package first

import first.gorm.Color
import first.gorm.Face
import first.gorm.Geometry
import first.gorm.Material
import first.gorm.Mesh
import first.gorm.Spatial
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

        //Face compose three vertexes
        def f1 = new Face(vertexes: [
                new Vertex(x:0, y:0, z:0),
                new Vertex(x:1, y:0, z:0),
                new Vertex(x:0, y:1, z:0)
        ])
        f1.save()
        assert !f1.hasErrors()

        def f2 = new Face()
        f2.addToVertexes(new Vertex(x:0, y:0, z:0))
        f2.addToVertexes(new Vertex(x:1, y:0, z:0))
        f2.addToVertexes(new Vertex(x:0, y:1, z:0))
        f2.save()
        assert !f2.hasErrors()

        //Mesh compose any count faces
        def mesh = new Mesh()
        mesh.addToFaces(f1)
        //mesh.save()

        //Spatial
        def s = new Spatial(name: 'Artur')
        s.userData = [eyeColor: 'black', hairColor: 'blue']
        s.save()

        //Geometry compose one mesh
        def g = new Geometry(name: 'новая геометрия', mesh: mesh)
        g.save()

        println 'finish gorm'
    }
}
