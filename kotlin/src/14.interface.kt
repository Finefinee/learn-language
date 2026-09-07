fun main() {

    var dog = Dog()
    dog.eat()
    dog.run()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("우다다다 달립니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}