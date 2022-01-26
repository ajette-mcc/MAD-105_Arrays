fun main(args: Array<String>) {
    var Hotel_Room_Type = arrayOf("Standard Non-smoking", "Standard Smoking", "Suite Non-smoking", "Suite Smoking", "Handicap Room")
    var count = 0

    while (count < Hotel_Room_Type.size) {
        println ("Hotel Room Type: ${Hotel_Room_Type[count]}")
        count++
    }
    println("Program arguments: ${args.joinToString()}")
}