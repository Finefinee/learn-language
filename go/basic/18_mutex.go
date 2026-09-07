package basic

import (
	"sync"
)

var Count18 int
var Mutex18 sync.Mutex

func Increase18(c chan int) {
	Mutex18.Lock()
	defer Mutex18.Unlock()

	Count18++
	c <- Count18
}
