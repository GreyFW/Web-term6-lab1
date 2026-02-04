fun main(args: Array<String>) {
    if (args.isEmpty()) {
        return
    }

    val text = args.joinToString(" ")
    val words = text.split("\\s+".toRegex()).filter { it.isNotBlank() }

    val alphabetic = words.sorted()

    // выше код из задания 2, ниже дополнили для задания 3:
    val unique = alphabetic.distinct().joinToString(" ")
    println(unique)
}
