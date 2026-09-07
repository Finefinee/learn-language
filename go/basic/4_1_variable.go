package basic

import (
	"fmt"
	"reflect"
)

func _() {
	var a int = 32
	var b int
	var c = 4
	d := 5

	fmt.Println(a, b, c, d)
	fmt.Println(reflect.TypeOf(a), reflect.TypeOf(b), reflect.TypeOf(c), reflect.TypeOf(d))
}