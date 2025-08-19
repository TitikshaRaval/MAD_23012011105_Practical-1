fun main() {
    println("Enter integers separated by spaces:")

    val input = readLine()!!.trim()
    val parts = input.split(" ")

    var smallCount = 0
    var mediumCount = 0
    var largeCount = 0

    for (p in parts) {
        val num = p.toInt()
        when (num) {
            in 1..10 -> smallCount++
            in 11..100 -> mediumCount++
            in 101..Int.MAX_VALUE -> largeCount++
            else -> {}
        }
    }

    println("Small: $smallCount")
    println("Medium: $mediumCount")
    println("Large: $largeCount")
}
