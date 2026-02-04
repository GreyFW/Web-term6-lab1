fun main(args: Array<String>) {
    if (args.isEmpty()) {
        return
    }

    val text = args.joinToString(" ")
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }

    val frequencies = mutableMapOf<String, Int>()
    for (word in words) {
        frequencies[word] = frequencies.getOrDefault(word, 0) + 1
    }

    val wordsWithFreqs = frequencies.entries
        .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }
            .thenBy{ it.key })
        .joinToString(" ") { "${it.key} ${it.value}" }
    println(wordsWithFreqs)
}
