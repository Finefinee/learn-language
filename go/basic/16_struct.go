package basic

import "fmt"

type person struct {
	name    string
	age     int
	favFood []string
}

func _() {
	nico := person{
		name:    "nico",
		age:     18,
		favFood: []string{"kimchi"},
	}
	fmt.Println(nico)
}
