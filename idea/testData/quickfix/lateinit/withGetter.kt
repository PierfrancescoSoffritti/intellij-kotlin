// "Remove getter from property" "true"

class A {
    <caret>lateinit var str: String
        get() = ""
}
/* IGNORE_FIR */