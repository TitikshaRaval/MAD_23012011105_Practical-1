fun main(){
    val paragraph = """
        Kotlin is great. Kotlin is concise, safe, and expressive.
        Java and Kotlin both run on the JVM. Kotlin is popular!
    """.trimIndent()

    val cleanParagraph = paragraph
        .lowercase()
        .replace("."," ")
        .replace(","," ")
        .replace("!"," ")

    val word = cleanParagraph.split(" ")

    val filteredWords = word.filter { it.isNotBlank() }

    val wordFreq = filteredWords.groupingBy{it}.eachCount()

    val top5 = wordFreq.entries.sortedByDescending { it.value }.take(5)

    println("Top 5 words:")
    top5.forEach { println("${it.key}->${it.value}") }
}