package inheritancesolution

class ConvertToLowerCase(file: String) : FileReader(file) {

    override fun read(): String {
        val word = super.read()
        return word.toLowerCase()
    }

}