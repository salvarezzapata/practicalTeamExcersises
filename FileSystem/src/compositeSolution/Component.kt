package compositeSolution

abstract class Component(var name: String = "", var weight: Int = 0) {

    abstract fun copy(): Component
    abstract fun calculateWeight(): Int
}