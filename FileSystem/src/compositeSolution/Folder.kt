package compositeSolution

class Folder(var nameFolder: String = "", var weightFolder: Int = 0) : Component(nameFolder, weightFolder) {

    private var systemFiles: MutableList<Component> = mutableListOf()

    fun add(element: Component) {
        systemFiles.add(element)
    }

    fun search(name: String): Component {
        systemFiles.forEach { component: Component ->
            if(name == component.name) return component
        }
        throw Exception("compositeSolution.Component not found")
    }

    override fun copy(): Component {
        return this
    }

    fun remove(element: Component) {
        systemFiles.remove(element)
    }

    override fun calculateWeight(): Int {
        var totalWeight: Int = 0
        systemFiles.forEach { component: Component ->
            totalWeight += component.calculateWeight()
        }
        return totalWeight
    }

    private fun showInformation(component: Component): String {
        return if (component is Folder) {
            "${component.name} -> ${component.systemFiles}"
        } else {
            "${component.name} (${component.weight})"
        }
    }

    override fun toString(): String {
        var content: String = "$name contains: \n"
        systemFiles.forEach { component: Component ->
            content += "${showInformation(component)} \n"

        }
        return content
    }
}