fun main() {
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}