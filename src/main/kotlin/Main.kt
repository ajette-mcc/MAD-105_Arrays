fun main(args: Array<String>) {
    var Hotel_Room_Type = arrayOf("Standard Non-smoking", "Standard Smoking", "Suite Non-smoking", "Suite Smoking", "Handicap Room")
    var Room_Qty = arrayOf("5", "3", "4", "2", "1")
    var Type_Qty = arrayOf<Array<String>>()
    var Entry = "X"
    var Update: Int = 0
    Type_Qty+= Hotel_Room_Type
    Type_Qty+= Room_Qty

    var count = 0
    while (count < Hotel_Room_Type.size) {
        //println ("Hotel Room Type: ${Hotel_Room_Type[count]}")
        println ("Hotel Room Type: ${Type_Qty[0][count]} and # of these rooms: ${Type_Qty[1][count]}")
        //println ("Hotel Room Qty: $Type_Qty")
        count++
    }
    do {
        print("Book a room (Enter B), Release a room (Enter R), Check quantity of a room (Enter Q), or Exit (Enter X): ")
        Entry = readLine()!!.toString()
        if (Entry == "B") {
            println("Booking a Room")
            Update = Type_Qty[1][0].toInt()
            ++Update
            Type_Qty[1][0] = Update.toString()
            println("New # rooms = "+Update)
        }

      } while (Entry != "X")

    println("Program arguments: ${args.joinToString()}")
}