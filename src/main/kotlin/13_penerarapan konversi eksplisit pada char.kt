fun main() {
    //ASCII value
    var c: Char // character
    var i: Int //ordinal (ASCII) value of the character

    // conversion from ex o ASCII value
    c = 'a'
    i = c.toInt()
    print("The character $c was converted to its ASCII value of $i")

    //conversion from on ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was co0nverted to is textual value of $c")
}