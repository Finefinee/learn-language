package basic

import "fmt"

func add(x int, y int) int {
	return x + y
}

func _() {
	a := add(10, 20)
	fmt.Println(a)
}