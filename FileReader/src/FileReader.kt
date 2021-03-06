import util.EMPTY

class FileReader(var file: String) : Reader{

    private var indexToContentFile: Int = -1

    override fun leer(): String {
        indexToContentFile++
        if(indexToContentFile >= file.length){
            throw Exception("The file was read complete or file is empty")
        }else{
            return file[indexToContentFile].toString()
        }
    }

    override fun close() {
        file = EMPTY
        indexToContentFile = -1
    }
}