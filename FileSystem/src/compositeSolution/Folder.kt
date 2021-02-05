package compositeSolution

class Folder(var nameFolder: String = "", var weightFolder: Int = 0) : Component(nameFolder, weightFolder) {

    private var systemFiles: MutableList<Component> = mutableListOf()

    fun add(element: Component) {
        systemFiles.add(element)
    }

    fun search(name: String): Component {
        systemFiles.forEach { component: Component ->
            if (name == component.name) {
                return component
            }

            if (component is Folder) {
                return component.search(name)
            }
        }
        throw Exception("Component not found")
    }

    override fun copy(): Component {
        return this
    }

    fun remove(element: Component) {
        if(systemFiles.contains(element)) {
            systemFiles.remove(element)
        } else {
            systemFiles.forEach { component: Component ->
                if(component is Folder) {
                    component.remove(element)
                }
            }
        }
    }

    override fun calculateWeight(): Int {
        return systemFiles.map {
            it.calculateWeight()
        }.reduce { totalWeight: Int, currentValue: Int -> totalWeight + currentValue }
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