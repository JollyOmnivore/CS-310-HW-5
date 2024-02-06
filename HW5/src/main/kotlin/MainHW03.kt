import java.util.*
object MainHW03 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter a size ")
        var size: String? = readLine()
        var intsize: Int = size!!.toInt()

        val sortAlgorithms = ArrayList<Sort>()
        sortAlgorithms.add(BubbleSort())
        sortAlgorithms.add(SelectionSort())
        sortAlgorithms.add(InsertionSort())
        sortAlgorithms.add(JavaSort())

        val originalData = makeNewRandomData(intsize)

        for (algorithm in sortAlgorithms) {
            algorithm.setData1(originalData.clone())
            algorithm.sortData()
            val ok = algorithm.isSorted
            val runtime = algorithm.runtime
            val name = algorithm.name
            val msg = String.format("algorithm %15s, runtime = %10d ns, isSorted = %b", name, runtime, ok)
            println(msg)
        }
    }

    private fun makeNewRandomData(size: Int): IntArray {
        val data = IntArray(size)
        val random = Random()
        for (i in 0 until size) {
            data[i] = random.nextInt(size * 5)
        }
        return data
    }
}