// "Add non-null asserted (!!) call" "true"
// WITH_RUNTIME

fun foo(a: List<String>?) {
    for (s in <caret>a) {}
}
