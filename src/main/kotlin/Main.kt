fun main(args: Array<String>) {
    var Hotel_Room_Type = arrayOf("Standard Non-smoking", "Standard Smoking", "Suite Non-smoking", "Suite Smoking", "Handicap Room")
    var Room_Qty = arrayOf("5", "3", "4", "2", "1")
    var Type_Qty = arrayOf<Array<String>>()
    var Entry = "X"
    var Entry2 = 0
    var Update: Int = 0

    // Create 2 Dimensional Matrix called Type_Qty [Room Type , # Rooms]
    Type_Qty+= Hotel_Room_Type
    Type_Qty+= Room_Qty

    // Print different room types and # rooms available of each type
    var count = 0
    while (count < Hotel_Room_Type.size) {
        println ("Hotel Room Type: ${Type_Qty[0][count]} and # of these rooms: ${Type_Qty[1][count]}")
        count++
    }
    do {
        print("Book a room (Enter B), Release a room (Enter R), Check quantity of a room (Enter Q), or Exit (Enter X): ")
        Entry = readLine()!!.toString()

        // Book a Room
        if (Entry == "B") {
            print("Select Room Type to Book: Std NS (1), Std Smok (2), Suite NS (3), Suite Smok (4), Handicap (5): ")
            Entry2 = readLine()!!.toInt()
            --Entry2
            if (Entry2 < Hotel_Room_Type.size) {
                Update = Type_Qty[1][Entry2].toInt()
                if (Update > 0) {
                    --Update
                    Type_Qty[1][Entry2] = Update.toString()
                    println("New # rooms = " +Update)
                }
                else println ("Sorry, no rooms of that type currently available")
            }
            else println("Invalid Room Type")
        }
        // Release a Room
        else if (Entry == "R") {
            print("Select Room Type to Release: Std NS (1), Std Smok (2), Suite NS (3), Suite Smok (4), Handicap (5): ")
            Entry2 = readLine()!!.toInt()
            --Entry2
            if (Entry2 < Hotel_Room_Type.size) {
                Update = Type_Qty[1][Entry2].toInt()
                // NOTE:  Might want some error checking (ie: if the hotel only has 2 handicapped rooms, we never should have more than 2 of these rooms available
                ++Update
                Type_Qty[1][Entry2] = Update.toString()
                println("New # rooms = " +Update)
            }
            else println("Invalid Room Type")
        }
        // Check on number of rooms available of a certain type
        else if (Entry == "Q") {
            print("Select Room Type for Availability: Std NS (1), Std Smok (2), Suite NS (3), Suite Smok (4), Handicap (5): ")
            Entry2 = readLine()!!.toInt()
            --Entry2
            if (Entry2 < Hotel_Room_Type.size) {
                Update = Type_Qty[1][Entry2].toInt()
                Type_Qty[1][Entry2] = Update.toString()
                println("Number of rooms available = " +Update)
            }
            else println("Invalid Room Type")

        }
        else if (Entry != "X") {
            println ("Invalid Entry")
        }

      } while (Entry != "X")

    println("Program arguments: ${args.joinToString()}")
}