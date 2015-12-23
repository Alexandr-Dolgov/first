package first.gorm

class Face {
    List vertexes

    static hasMany = [vertexes: Vertex]

    static constraints = {
        vertexes(size: 3..3)
    }
}
