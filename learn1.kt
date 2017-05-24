package LearnKotlin

open Java.Money

// TODO: single-line comment
/* TODO: multi-line comment */

/**
 * An attempt at making the most obscenely "large" class to demonstrate all Kotlin's
 * lang features / sugars.
 **/
class Foo (
    val FirstName: string, val LastName: string, val AccountNumber: string,
    val Age: Int, val Balance: Money)
{
    init {

    }
    constructor: this(FirstName, LastName, AccountNumber, Age, 0.00) (
        val FirstName: string, val LastName: string,
        val AccountNumber: string, val Age: Int)
    {

    }
}

/**
 * Abstract class example
 **/
open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are open by default
    fun b() { print("b") }
}

class C() : A(), B {
    // the compiler requires f() to be overridden, due to 'open' definition
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}


