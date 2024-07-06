fun main() {
    val n1 = 10
    val n2 = 30

    var a = n1
    var b = n2

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    val gcd = a
    println("The GCD of $n1 and $n2 is $gcd")
}


