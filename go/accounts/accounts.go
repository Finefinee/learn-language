package accounts

import "errors"

type Account struct {
	owner   string
	balance int
}

// NewAccount 새 계좌 생성
func NewAccount(owner string) *Account {
	account := Account{owner: owner, balance: 0}
	return &account
}

// Deposit 입금
func (a *Account) Deposit(amount int) {
	a.balance += amount
}

// Balance 잔액 확인
func (a *Account) Balance() int {
	return a.balance
}

// Withdraw 출금
func (a *Account) Withdraw(amount int) error {
	if a.balance < amount {
		return errors.New("can't withdraw")
	}
	a.balance -= amount
	return nil
}

// ChangeOwner 계좌 주인 변경
func (a *Account) ChangeOwner(newOwner string) {
	a.owner = newOwner
}

// Owner 주인 반환
func (a *Account) Owner() string {
	return a.owner
}