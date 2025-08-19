fun greet(name: String = "Guest", punctuation: Char = '!') {
    println("Hello, $name$punctuation")
}

fun main(args: Array<String>) {
    var name: String = "Guest"
    var punctuation: Char = '!'

    for (i in args.indices) {
        when (args[i]) {
            "--name" -> if (i + 1 < args.size) name = args[i + 1]
            "--punctuation" -> if (i + 1 < args.size && args[i + 1].isNotEmpty()) {
                punctuation = args[i + 1][0]
            }
        }
    }
    greet(name, punctuation)
}
