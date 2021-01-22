import inheritancesolution.ConvertToLowerCase
import inheritancesolution.PutUnderscore
import inheritancesolution.Reader

fun main() {
    var shortFile: String = "Hola"
    val longFile: String = "Documento de prueba para ensayar la funcionalidad del componente. Exitos"
    val convertToLowerCase: Reader = ConvertToLowerCase(shortFile)

    println("---Lower Case---")
    shortFile.forEach {
        print(convertToLowerCase.read())
    }

    println()
    println()

    println("--Underscore---")

    val putUnderscoreFilter: Reader = PutUnderscore(longFile)
    longFile.forEach {
        print(putUnderscoreFilter.read())
    }

}