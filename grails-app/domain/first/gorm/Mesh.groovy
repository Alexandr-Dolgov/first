package first.gorm

class Mesh {
    List faces

    static hasMany = [faces: Face]
}
