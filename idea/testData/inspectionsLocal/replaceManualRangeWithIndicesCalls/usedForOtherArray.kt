// WITH_RUNTIME
// FIX: Replace with indices
fun foo() {
    val a = listOf(1, 2, 3)
    val b = listOf(11, 22, 33, 44, 55)
    for (i in <caret>0 until a.size) {
        println(b[i])
    }
}