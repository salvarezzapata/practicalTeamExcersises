package compositeSolution

fun main() {

    val folder: Folder = Folder(
        nameFolder = "compositeSolution.Folder 1"
    )

    val file1: Component = File(
        nameFile = "File1",
        weightFile = 1
    )

    val file2: Component = File(
        nameFile = "file2",
        weightFile = 2
    )

    folder.add(file1)
    folder.add(file2)


    val folder2: Folder = Folder(
        nameFolder = "compositeSolution.Folder 2"
    )

    val file3: Component = File(
        nameFile = "File3",
        weightFile = 3
    )

    val file4: Component = File(
        nameFile = "file4",
        weightFile = 3
    )

    val folder3 = Folder(
        nameFolder = "compositeSolution.Folder 3"
    )

    folder3.add(file2)

    folder2.add(file3)
    folder2.add(file4)
    folder2.add(folder3)

    folder.add(folder2)

    println(folder)

    println(folder2)

    println("compositeSolution.Folder 2 weight = ${folder2.calculateWeight()}")
    println("compositeSolution.Folder 1 weight = ${folder.calculateWeight()}")


    println()
    val component: Component = folder.search("compositeSolution.Folder 2")
    println("compositeSolution.Component founded: \n$component")

    folder.remove(folder2)

    println()

    try {
        val component2: Component = folder.search("compositeSolution.Folder 2")
        println("compositeSolution.Component founded: \n$component2")
    }catch (exception: Exception){
        println(exception)
    }

    val copyFolder = folder.copy()
    println("compositeSolution.Folder copied: \n$copyFolder")

    val copyFile: Component = file1.copy()
    println("compositeSolution.File copied: $copyFile")





}