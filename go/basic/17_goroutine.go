package basic

import (
	"fmt"
	"time"
)

func _() {
	c := make(chan string)
	people := [2]string{"nico", "nico2"}
	for _, person := range people {
		go isSexy(person, c)
	}
	for i := 0; i < len(people); i++ {
		fmt.Println(<-c)
	}
}

func isSexy(person string, c chan string) {
	time.Sleep(time.Second * 3)
	c <- person + " is sexy"
}
