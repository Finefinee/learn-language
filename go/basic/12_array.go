package basic

import "fmt"

func _() {
	names := []string{"nico", "nico", "nico", "nico", "nico"}
	names = append(names, "nico")
	names = append(names, "nico")
	names = append(names, "nico")
	names = append(names, "nico")
	names = append(names, "nico")
	names = append(names, "nico")

	fmt.Println(names[10])
}
