sealed class SEALED
class AAAA: SEALED()
object BBBB: SEALED()
class CCCC: SEALED()

fun foo(e: SEALED) {
    when (e) {
        is AAAA, CCCC -> TODO()
        <caret>
    }
}

// EXIST: BBBB
// EXIST: { lookupString: "else -> "}
// NOTHING_ELSE
// FIR_COMPARISON
