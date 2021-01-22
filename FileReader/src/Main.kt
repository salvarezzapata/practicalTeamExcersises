fun main() {
    var shortFile: String = "Hola, TODO BIEN?"
    val longFile: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"
    //val reader: Reader = FileReader(shortFile)
    val filterToLowerCase: ConvertToLowerCase = ConvertToLowerCase(shortFile)

    println("---LowerCase Filter---")
    shortFile.forEach {
        print(filterToLowerCase.read())
    }

    println()
    println()
    println("---Undescore Filter---")
    val filterUnderscore: PutUnderscore = PutUnderscore(longFile)

    longFile.forEach {
        print(filterUnderscore.read())
    }


}