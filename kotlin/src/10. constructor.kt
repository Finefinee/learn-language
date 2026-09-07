fun main() {

    var a = Person("a", 1000)
    var b = Person("b", 1000)
    var c = Person("c", 1000)

    var d = Person("d")
    var e = Person("e")
    var f = Person("f")
}

class Person (var name: String, val birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}