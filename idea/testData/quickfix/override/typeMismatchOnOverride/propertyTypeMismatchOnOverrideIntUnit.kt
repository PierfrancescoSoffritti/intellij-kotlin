// "Change type to 'Int'" "true"
abstract class A {
    abstract var x : Int
}

abstract class B : A() {
    override abstract var x<caret>
}

/* IGNORE_FIR */