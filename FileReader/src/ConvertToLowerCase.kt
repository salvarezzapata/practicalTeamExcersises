class ConvertToLowerCase(private val file: String) {

    private val reader: Reader = FileReader(file)

    fun read(): String {
        val word: String = reader.read()
        return word.toLowerCase()
    }
}