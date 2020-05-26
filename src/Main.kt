fun main(args: Array<String>) {
    val table: Array<Array<Int>> = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    for(row in table){
        for(cell in row){
            print("$cell \t")
        }
        println()
    }

    var user = User("F", "S")

    user.firstName = "Ugo"
    user.secondName = "Юго"

    println(user.firstName)

}
