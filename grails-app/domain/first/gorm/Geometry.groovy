package first.gorm

class Geometry extends Spatial{

    static hasOne = [mesh: Mesh]

    static constraints = {
    }
}
