fun main() {
  //Character occurence in a senence analsis
  // he string hat we want to  analyze

    var s = "A programmer gets stuck in he shower because he intruction on the shampoo were: Lather , wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    //counters initialization
    var vowelCount = 0
    var consonantCount = 0

    //definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjkImnpqrsvwxz"

    //main Loop
    for (c in s ) {
        if (vowels.contains(c)) {
            vowelCount++

        }else if (consonants.contains(c)){
            consonantCount++
        }
    }
    println("Vowels : $vowelCount")
    println("Consonants: $consonantCount")
    println("Other charcters: ${s.length - (vowelCount + consonantCount)}")

}