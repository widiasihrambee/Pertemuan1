fun main() {
    val a : Int = 10000
    println(" a apakah identiik dengan a atau a === a : "+ (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === antherBoxedA :" + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan antherBoxedA atau boxedA == anotherBoxedA :" + (boxedA == anotherBoxedA))
}