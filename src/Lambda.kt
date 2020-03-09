fun main(args: Array<String>) {
/*
Лямбда-выражения представляют небольшие кусочки кода, которые выполняют некоторые действия.
Фактически лямбды преставляют сокращенную запись функций. При этом лямбды могут передаваться в качестве параметра в функции.
Лямбда-выражения оборачиваются в фигурные скобки:

{println("hello")}
В данном случае лямбда-выражение выводит на консоль строку "hello".
 */
    val sum = {x:Int, y:Int -> println(x + y)}
    sum(2, 3)   // 5
    sum(4, 5)   // 9

/*
Если в лямбда-выражении надо выполнить не одно, а несколько действий,
то эти действия можно размещать на отдельных строках после стрелки:
 */
    val sum2 = {x:Int, y:Int ->
        val result = x + y
        println("$x + $y = $result")
    }
    sum2(2,5)
    sum2(5,5)

    var action = selectAction(1)
    println(action(8,5))    // 13

    action = selectAction(3)
    println(action(8,5))    // 3

}
fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата - возвращаем функцию
    when(key){
        1 -> return {x:Int, y: Int -> x + y}
        2 -> return {x:Int, y: Int -> x - y}
        3 -> return {x:Int, y: Int -> x * y}
        else -> return  {x:Int, y: Int -> 0}
    }


}