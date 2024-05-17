fun main(){
grade()
}

fun grade() {
    var math = 80
    var english = 60
    var kiswahili = 90
    var biology = 100
    var chemistry = 70
    var history =80
    var physics = 60
    var music = 100

    var t = (math + kiswahili + english + biology + chemistry + history + physics + music) / 8
    if (t>= 80) {
        println("A")
    }
    else if (t >= 60) {
        println("B")
    }
    else if (t >= 45)
    {
        println("C")
    }
    else if (t>=30)
    {
        println("D")
    }
    else if (t<30)
    {
        println("E")
    }
    else if (t<=1)
    {
        println("invalid")
    }
    else if (t>100)
        println("invalid")
    else{
        println("invalid")
    }
}