package main

import (
	"fmt"

	"github.com/Finefinee/LearnLanguage/question"
)

func main() {
	account := question.NewAccount("Finefinee")

	account.Deposit(1000)
	account.Withdraw(300)

	fmt.Println(account.Balance())
}
