package templatemthodsolution

import util.SPACE
import util.UNDERSCORE

class UnderscoredFilter(file: String) : Reader(file) {

    override fun filter(word: String): String {
        return if (word == SPACE) UNDERSCORE else word
    }
}