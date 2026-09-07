package basic

import "fmt"

func _() {
	nico := map[string]string{
		"name": "nico",
		"age": "20",
	}
	fmt.Println(nico)

	for key, value := range nico {
		fmt.Println(key, value)
	}
}
