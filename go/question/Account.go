package question

import (
	"errors"
	"sync"
)

var (
	ErrInvalidDepositAmount  = errors.New("invalid deposit amount")
	ErrInvalidWithdrawAmount = errors.New("invalid withdraw amount")
)

type Account struct {
	owner   string
	balance int
	mu      sync.Mutex
}

func NewAccount(owner string) *Account {
	return &Account{owner: owner, balance: 0}
}

func (a *Account) Deposit(amount int) error {
	if amount <= 0 {
		return ErrInvalidDepositAmount
	}
	a.mu.Lock()
	defer a.mu.Unlock()
	a.balance += amount
	return nil
}

func (a *Account) Withdraw(amount int) error {
	a.mu.Lock()
	defer a.mu.Unlock()
	if a.balance < amount || amount <= 0 {
		return ErrInvalidWithdrawAmount
	}
	a.balance -= amount
	return nil
}

func (a *Account) Balance() int {
	a.mu.Lock()
	defer a.mu.Unlock()
	return a.balance
}
