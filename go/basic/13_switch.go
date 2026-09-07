package basic

import "fmt"

func canIDrinkAlcohol(age int) bool {
	switch age {
	case 10:
		return false
	case 18:
		return true
	}
	return false
}

func _() {
	fmt.Println(canIDrink(18))
}