package first.gorm

class Color {
    int r
    int g
    int b

    static belongsTo = [material: Material]
}

//тестовый коммит, который я надеюсь увидеть в веб-интерфейсе гит хаба, т.к. изменил
//для этого гит-проекта локальные имя пользователя и пароль на те, что сейчас отображаются в гитхабе
