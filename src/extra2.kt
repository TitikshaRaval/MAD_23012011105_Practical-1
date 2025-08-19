import java.io.File

fun readFileOrDefault(path: String?): String {
    val filePath = path ?: return "No file path provided."

    return try {
        File(filePath).readText()
    } catch (e: Exception) {
        "Could not read file: ${e.message}"
    }
}

fun main() {
    println(readFileOrDefault(null))
    println(readFileOrDefault("missing.txt"))
    println(readFileOrDefault("example.txt"))
}
