fun main() {
    var shortFile: String = "Hola"
    val longFile: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"

    val reader: Reader = FileReader(longFile)
    val richReader: RichReader = RichReaderImpl(reader)

    longFile.forEach {
        print(richReader.replaceSpaceToUnderline())
    }

}