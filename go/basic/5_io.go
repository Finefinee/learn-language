package basic

import (
	"bufio"
	"fmt"
	"os"
)

func _() {
	stdin := bufio.NewReader(os.Stdin)
	var a int
	var b int

	n, err := fmt.Fscanln(stdin, &a, &b)

	if err != nil {
		fmt.Println(err)
		_, _ = stdin.ReadString('\n')
	} else {
		fmt.Println(a, b, n)
	}

	n, err = fmt.Scanln(&a, &b)

	if err != nil {
		fmt.Println(err)
		_, _ = stdin.ReadString('\n')
	} else {
		fmt.Println(a, b, n)
	}
}
