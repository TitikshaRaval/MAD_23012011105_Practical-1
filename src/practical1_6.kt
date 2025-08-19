fun operation(a: Int, b: Int , c: Int){
    println("Addition of $a, $b ,$c is ${a + b + c}")
    println("Subtraction of $a, $b, $c is ${a - b - c}")
    println("Multiplication of $a, $b, $c is ${a * b * c}")
    if (b != 0) {
        println("Division of $a, $b is ${a.toDouble() / b}")
    } else {
        println("Division: Cannot divide by zero")
    }
}

fun main(){
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    operation(a,b,c)
}