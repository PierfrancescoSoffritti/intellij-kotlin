// "Replace with safe (?.) call" "true"
// WITH_RUNTIME
var i: Int? = 0

fun foo(s: String?) {
    i = s<caret>.length
}
