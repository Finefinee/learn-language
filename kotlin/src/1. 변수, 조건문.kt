fun main() {
    var a: Int = 10 // 변수 값 변경 ㄱㄴ
    val b: Double = 3.14 // 값 변경 ㄴㄴ
    val sum = a + b

    if (sum > 10) {
        println("sum이 10보다 큽니다.")
    } else {
        println("sum이 10 이하입니다.")
    }

    val grade = 90
    when (grade) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        else -> println("C 이하")
    }
}