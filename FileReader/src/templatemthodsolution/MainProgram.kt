package templatemthodsolution

fun main() {
    val longFile: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"
    val shortFile: String = "HoLa, CoMo EsTaS?"
    val lowerCaseFilter: Reader = LowerCaseFilter(shortFile)
    val underscoreFilter: Reader = UnderscoredFilter(longFile)

    println("---Lower Case---")
    shortFile.forEach {
        print(lowerCaseFilter.read() )
    }

    println()
    println()

    println("--Underscore---")
    longFile.forEach {
        print(underscoreFilter.read())
    }
}