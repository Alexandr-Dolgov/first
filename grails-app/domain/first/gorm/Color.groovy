package first.gorm

class Color {
    int r
    int g
    int b

    static belongsTo = [material: Material]
}
