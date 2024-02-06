class BubbleSort internal constructor() : Sort() {
    init {
        name = "BubbleSort"

    }

    override fun sortData() {
        val N = data.size
        var swapped: Boolean = false
        startTimer()
        while (swapped == false ) {
            for (i in 0 until N - 1) {
                if (data[i] > data[i + 1]) {
                    swap(data[i], data[i + 1])
                    swapped = true
                }
            }
        }
        stopTimer()
    }
}