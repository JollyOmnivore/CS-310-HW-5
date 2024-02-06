internal class InsertionSort : Sort() {
    init {
        name = "InsertionSort"
    }

    override fun sortData() {
        val N = data.size
        startTimer()
        for (i in 1 until N) {
            val `val` = data[i]
            var loc = i - 1
            while (loc >= 0 && data[loc] > `val`) {
                data[loc + 1] = data[loc]
                loc -= 1
                data[loc + 1] = `val`
            }
        }
        stopTimer()
    }
}