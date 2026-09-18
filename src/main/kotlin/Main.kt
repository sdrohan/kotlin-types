package ie.setu.types.main

fun main(args: Array<String>) {
    typeInference()
    usingUnderscores()
    booleansAndCharacters()
    explicitConversions(25)
    mutableVariables(10,20)
}

fun typeInference() {
    println ("\n==========================================================")
    println ("============  Using Type Inference in Kotlin =============")
    println ("==========================================================")

    val doubleNumber = 1200.45
    val floatNumber = 700.78f
    val longNumber = 98765432L
    val intNumber = 123456
    val shortNumber = 345
    val byteNumber = 127

    println("doubleNumber value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   " + byteNumber + ", and the type is: " + byteNumber.javaClass)
}

fun usingUnderscores(){
    println ("\n==========================================================")
    println ("=========  Using underscores in numeric values ===========")
    println ("==========================================================")

    //underscores make number values more readable in code

    println("Using underscores to make values more readable:")
    val oneMillion = 1_000_000
    val threeThousand = 3_000
    val creditCardNumber = 1234_4321_5678_8765

    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)
}

fun booleansAndCharacters(){
    println ("\n==========================================================")
    println ("================  Booleans and Characters ================")
    println ("==========================================================")

    //characters in kotlin
    val aChar = 'a'            //type inference
    val bChar: Char = 'b'   //explicitly defining the type
    println("aChar: " + aChar + " - the type is: " + aChar.javaClass)
    println("bChar: " + bChar + " - the type is: " + bChar.javaClass)


    //booleans in kotlin
    val aFlag = true
    val bFlag: Boolean = false
    println("aFlag: " + aFlag + " - the type is: " + aFlag.javaClass)
    println("bFlag: " + bFlag + " - the type is: " + bFlag.javaClass)
}

fun explicitConversions(inputByte : Byte){
    println ("\n==========================================================")
    println ("=================  Explicit Conversions ==================")
    println ("==========================================================")

    val byteNum: Byte = inputByte       //static type check: OK
    val intNum: Int = byteNum.toInt()   //explicit conversion: OK
    val floatNum: Float = byteNum.toFloat()
    val doubleNum: Double = intNum.toDouble()

    println("byteNum: "   + byteNum)
    println("intNum: "    + intNum)
    println("floatNum: "  + floatNum)
    println("doubleNum: " + doubleNum)
}

fun mutableVariables (input: Int, updatedNumber: Int){
    println ("\n==========================================================")
    println ("===========  Working with Mutable Variables =============")
    println ("==========================================================")

    //mutable variables
    var number = input   //Int type is inferred

    number++;       //mathematical operations are allowed
    println("Mutable number: " + number)

    number = updatedNumber;       //Allowed to reassign a var too
    println("Mutable number (updated): " + number)
}