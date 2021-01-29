package compositeSolution

import compositeSolution.Component

class File(var nameFile: String = "", var weightFile: Int = 0) : Component(nameFile, weightFile) {

    override fun copy(): Component {
        return this
    }

    override fun calculateWeight(): Int {
        return weight
    }

    override fun toString(): String {
        return "$name ($weight)"
    }
}