fun main() {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt // konversi imlisit
    println("Konversi variabel balInt secara implisit:"+ valSum)
    val valLog: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : "+ valLog)
}