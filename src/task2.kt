fun main(args: Array<String>) {
    if (args.isEmpty()) {
        return
    }

    val text = args.joinToString(" ")
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }

    // выше код из задания 1, ниже дополнили для задания 2:
    val alphabetic = words.sorted()
    alphabetic.forEach{ println(it) }
}
