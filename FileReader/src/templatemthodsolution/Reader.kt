package templatemthodsolution

abstract class Reader(private var file: String) {

    protected var indexToFile: Int = -1

    fun read(): String {
        indexToFile++
        val word: String = file[indexToFile].toString()
        return filter(word)
    }

    abstract fun filter(word: String): String
}