package first.gorm

class Material {
    String name

    static hasOne = [color: Color]

    static constraints = {
    }
}
