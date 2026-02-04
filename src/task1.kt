fun main(args: Array<String>) {
    if (args.isEmpty()) {
        return
    }

    val text = args.joinToString(" ")
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }

    words.forEach { println(it) }
}
