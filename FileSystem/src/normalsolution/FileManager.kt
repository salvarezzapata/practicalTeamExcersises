package normalsolution

class FileManager(
    var name: String,
    var weight: Int = 0,
    private val fileManagerList: MutableList<FileManager> = mutableListOf()
) {
    fun add(fileManager: FileManager) {
        fileManagerList.add(fileManager)
    }

    fun search(name: String): FileManager {
        fileManagerList.forEach { fileManager: FileManager ->
            if(name == fileManager.name) return fileManager
        }
        throw Exception("Not found")
    }

    fun calculateWeight(): Int {
        var totalWeight = 0
        fileManagerList.forEach { fileManager: FileManager ->
            totalWeight += fileManager.weight
        }
        return totalWeight
    }
}