package basic

import "sync"

var (
	Count19 int
	Mutex19 sync.Mutex
	Wg19    sync.WaitGroup
)

func IncreaseCount() {
	defer Wg19.Done()
	Mutex19.Lock()
	defer Mutex19.Unlock()
	Count19++
}
