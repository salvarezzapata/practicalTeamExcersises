import util.SPACE
import util.UNDERSCORE

class RichReaderImpl(private val reader: Reader) : RichReader {

    override fun toLowerCase(): String {
        return reader.read().toLowerCase()
    }

    override fun replaceSpaceToUnderline(): String {
        return reader.read().replace(SPACE, UNDERSCORE)
    }
}