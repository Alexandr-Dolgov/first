package first.gorm

class Vertex {
    float x
    float y
    float z

    static belongsTo = [Face]
}
