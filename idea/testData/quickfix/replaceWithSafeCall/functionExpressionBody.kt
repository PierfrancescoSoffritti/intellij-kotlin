// "Replace with safe (?.) call" "true"
// WITH_RUNTIME
// ERROR: Type mismatch: inferred type is Int? but Int was expected

// Note: There should be no error in FIR but errors are not currently checked for FIR
class T {
    fun foo(s: String?): Int = s<caret>.length
}
/* FIR_COMPARISON */