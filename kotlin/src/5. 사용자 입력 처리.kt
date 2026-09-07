fun main() {
    print("숫자를 입력하세요: ")
    val num = readLine()!!.toInt() // null이 강제로 아님을 선언, 정수로 변환
    if (num % 3 == 0) {
        println("3의 배수입니다.")
    } else {
        println("3의 배수가 아닙니다.")
    }
}