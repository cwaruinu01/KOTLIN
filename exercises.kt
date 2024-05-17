import kotlin.math.PI

fun main(){
    arithmetic()
    areaperimeter()
    maxmin()
}

/*write a kotlin program to find the maximum and minimum of three numbers.
 */
fun maxmin(){
    var no1=674839596
    var no2=695764038
    var no3=684394753

   val maximum= maxOf(no1,no2,no3)
    val minimum= minOf(no1,no3,no2)
    println("maximum of $no1,$no2 and $no3 is $maximum")
    println("minimum of $no1,$no2 and $no3 is $minimum")




}
/* write a kotlin program to calculate the area and perimeter of a circle */
fun areaperimeter(){
    var radius=91
    var pi= PI
    var area=(pi*radius*radius)
    println(area)

    var  perimeter=(pi*2*radius)
    println(perimeter)

}
/* write a kotlin program to perform addition,subtraction,multiplication an division of two numbers*/
fun arithmetic() {
    var no1 = 674839596
    var no2 = 695764038

    var sum = (no1 + no2)
    println(sum)
    var sub = (no2 + no1)
    println(sub)
    var mult = (no2 * no1)
    println(mult)
    var div = (no2 / no1)
    println(div)
}


