package basic

import "fmt"

func superAdd(numbers ...int) (total int) {

	total = 0

	for _, value := range numbers {
		total += value
	}

	return total
}

func _() {
	total := superAdd(1, 2, 3, 4, 5)
	fmt.Println(total)
}