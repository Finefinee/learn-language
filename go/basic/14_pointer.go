package basic

import "fmt"

func _() {
	a := 2
	b := &a
	a = 10
	fmt.Println(a, *b)
}
