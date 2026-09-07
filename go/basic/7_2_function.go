package basic

import (
	"errors"
	"fmt"
	"os"
)

func div (x int, y int) (result int, err error) {
	if y == 0 {
		return 0, errors.New("division by zero")
	} else {
		return x / y, nil
	}
}

func _() {
	var x, y int
	_, err := fmt.Fscanln(os.Stdin, &x, &y)

	if err != nil {
		fmt.Println(err)
		return
	}

	result, err := div(x, y)

	if err != nil {
		fmt.Println(err)
		return
	}

	fmt.Println(result)
}