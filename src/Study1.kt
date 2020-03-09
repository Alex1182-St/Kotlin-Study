fun isFirstGreater(base1: Double, height1: Double, base2: Double, height2: Double): Boolean{

    fun square(base: Double, height: Double) = base * height / 2

    return square(base1, height1) > square(base2, height2)
}

fun main(args: Array<String>) {

    val a = isFirstGreater(10.0, 10.0, 20.0, 20.0)
    val b = isFirstGreater(20.0, 20.0, 10.0, 10.0)
    println("a=$a  b=$b")
}