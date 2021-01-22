package templatemthodsolution

class LowerCaseFilter(file: String) : Reader(file) {

    override fun filter(word: String): String {
        return word.toLowerCase()
    }
}