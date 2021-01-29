package normalsolution

fun main() {
    val folder1 = FileManager(
        name = "compositeSolution.Folder 1"
    )

    val file1 = FileManager(
        name = "compositeSolution.File 1",
        weight = 1
    )

    folder1.add(file1)

    println(folder1.calculateWeight())
}