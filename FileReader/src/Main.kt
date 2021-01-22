fun main() {
    var shortFile: String = "Hola"
    val file: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"

    val reader: Reader = FileReader(shortFile)
    val richReader: RichReader = RichReaderImpl(reader)

    shortFile.forEach {
        print(richReader.toLowerCase())
    }

}