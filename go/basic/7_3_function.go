package basic

import "fmt"

func returnFive() (five int) {
	five = 5
	return
}

func _() {
	five := returnFive()
	fmt.Println(five)

}
