package question

//정수형 변수 num이 주어졌을 때, num이 3의 배수인지 판별하여
//3의 배수면 "3의 배수입니다."를, 아니면 "3의 배수가 아닙니다."를 출력하는 코드를 작성하세요.

fun main() {
    var num: Int = 9
    if (num % 3 == 0) {
        println("3의 배수입니다.")
    } else {
        println("3의 배수가 아닙니다.")
    }
}