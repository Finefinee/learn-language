package main

import (
	"fmt"

	"github.com/Finefinee/LearnLanguage/basic"
)

var C = make(chan int)

func main() {
	for i := 0; i < 100000; i++ {
		basic.Wg19.Add(1)
		go basic.IncreaseCount()
	}

	basic.Wg19.Wait()

	fmt.Println(basic.Count19)
}
