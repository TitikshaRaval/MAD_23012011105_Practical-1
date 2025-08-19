fun main() {
    while (true) {
        print("> ")
        val input = readLine()?.trim() ?: ""

        if (input.equals("exit", ignoreCase = true)) break
        if (input.isEmpty()) continue

        val tokens = input.split(" ")
        var result = tokens[0].toDouble()

        var i = 1
        while (i < tokens.size) {
            val op = tokens[i]
            val num = tokens[i + 1].toDouble()

            when (op) {
                "+" -> result += num
                "-" -> result -= num
                "*" -> result *= num
                "/" -> result /= num
                else -> {
                    println("Unknown operator: $op")
                    break
                }
            }
            i += 2
        }

        println("= $result")
    }
}
