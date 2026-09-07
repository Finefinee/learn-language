package basic

import "fmt"

func canIDrink(age int) bool {
	if koreanAge := age + 2; koreanAge < 18 {
		return false
	} else {
		return true
	}
}

func _() {
	fmt.Println(canIDrink(18))
}