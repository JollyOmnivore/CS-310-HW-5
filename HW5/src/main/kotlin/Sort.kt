public abstract class Sort {
    @JvmField
    var name: String? = null
    var data: IntArray = intArrayOf()
    var startTime: Long = 0
    var stopTime: Long = 0
    val isSorted: Boolean
        get() = true

    open fun sortData() {}
    fun setData1(clone: IntArray) {
        data = clone
    }

    fun swap(i: Int, j: Int) {
        var i = i
        var j = j
        val x = i
        i = j
        j = x
    }

    fun startTimer() {
        startTime = System.nanoTime()
    }

    fun stopTimer() {
        stopTime = System.nanoTime()
    }

    val runtime: Long
        get() = stopTime - startTime
}