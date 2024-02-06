import java.util.*

class JavaSort internal constructor() : Sort() {
    init {
        name = "JavaSort"
    }

    override fun sortData() {
        startTimer()
        Arrays.stream(data).sorted()
        stopTimer()
    }
}