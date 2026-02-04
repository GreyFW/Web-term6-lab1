fun main(args: Array<String>) {
    if (args.isEmpty()) {
        return
    }

    val text = args.joinToString(" ")
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }

    val alphabetic = words.sorted()

    // выше код из задания 2, ниже дополнили для задания 4:
    val frequencies = mutableMapOf<String, Int>()
    for (word in alphabetic) {
        frequencies[word] = frequencies.getOrDefault(word, 0) + 1
    }

    val wordsWithFreqs = frequencies.entries.forEach { println("${it.key} ${it.value}") }
}
