// "Replace with safe (?.) call" "true"
// WITH_RUNTIME

val functions: Map<String, () -> Any> = TODO()

fun run(name: String) = functions[name]<caret>()
/* IGNORE_FIR */