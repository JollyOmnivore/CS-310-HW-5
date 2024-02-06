class SelectionSort internal constructor() : Sort() {
    init {
        name = "SelectionSort"
    }

    override fun sortData() {
        /*

    selectionSort(data):
    */
        val N: Int = data.size
        startTimer()
        for (i in 0 until N - 1) {
            var index = i
            for (j in i + 1 until N) {
                if (data[j] < data[index]) {
                    index = j
                }
            }
            if (index != i) {
                swap(data[i], data[index])
            }
        }
        stopTimer()
    }
}