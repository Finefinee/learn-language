package basic

import "fmt"

func _() {
	var a int16 = 3456
	var b int8 = int8(a)

	fmt.Println(a, b)
}

var g int = 10

func _ () {
	m := 20

	{
		s := 50
		fmt.Println(m, s, g)
	}

	//m = 20 + s
}

func _() {
	var a float32 = 1234.523
	var b float32 = 3456.123
	var c float32 = a * b
	var d float32 = c * 3

	fmt.Println(a, b, c, d)
}