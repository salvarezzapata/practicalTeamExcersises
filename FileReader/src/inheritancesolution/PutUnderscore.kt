package inheritancesolution

import inheritancesolution.FileReader
import util.SPACE
import util.UNDERSCORE

class PutUnderscore(file: String) : FileReader(file) {

    override fun read(): String {
        val word = super.read()
        return if(word == SPACE) UNDERSCORE else word
    }
}