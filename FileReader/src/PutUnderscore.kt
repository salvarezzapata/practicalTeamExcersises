import util.SPACE
import util.UNDERSCORE

class PutUnderscore(private val file: String) {

    private val reader: Reader = FileReader(file)

    fun read(): String {
        val word = reader.read()
        return if(word == SPACE) UNDERSCORE else word
    }
}