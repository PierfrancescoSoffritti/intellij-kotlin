// "Wrap with '?.let { ... }' call" "true"
// ACTION: Add non-null asserted (!!) call
// ACTION: Replace overloaded operator with function call
// ACTION: Replace with safe (?.) call
// ACTION: Surround with null check

fun test(l: List<String>?, s: String) {
    if (s <caret>in l) {}
}
