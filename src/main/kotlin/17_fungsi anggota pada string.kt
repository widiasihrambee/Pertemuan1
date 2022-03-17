fun main() {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    //toUpperCase() and tolowerCase()
    var config = "Fullscreen shaDwos autosave"
    config = config.toLowerCase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen?"))
    println("will shadows be turned on?")
    println(config.contains("shadows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("would the player like to use autosave?")
    println(config.contains("autusave"))

    //replace
    var strJava ="Java is the best"
    strJava = strJava.replace("java", "kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    //substring

    println("I would not banish all of these Internes.".substring(2, 7))

    //compareto()
    println("alpha".compareTo("barvo"))

}