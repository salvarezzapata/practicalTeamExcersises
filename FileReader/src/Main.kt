fun main() {
    var shortFile: String = "Hola"
    val file: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"
    val reader: Reader = FileReader(shortFile)
    println(reader.leer())
    println(reader.leer())
    println(reader.leer())
    println(reader.leer())

}