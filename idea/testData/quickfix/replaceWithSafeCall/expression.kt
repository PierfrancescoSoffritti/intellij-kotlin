// "Replace with safe (?.) call" "true"
// WITH_RUNTIME
fun foo(s: String?) {
    1 + s<caret>.length
}
/* FIR_COMPARISON */