package mydict

import (
	"errors"
)

type Dictionary map[string]string

var (
	errNotFound = errors.New("not found")
	errAlreadyExists = errors.New("already exists")
)

// Search 검색
func (d Dictionary) Search(word string) (definition string, err error) {
	definition, exist := d[word]
	if exist {
		return definition, nil
	}
	return "", errNotFound
}

// Add 단어에 대한 정의를 사전에 Add
func (d Dictionary) Add(word, definition string) error {
	_, err := d.Search(word)
	if errors.Is(err, errNotFound) {
		d[word] = definition
		return nil
	}
	return errAlreadyExists
}

func (d Dictionary) Update(word, definition string) error {
	_, err := d.Search(word)
	if errors.Is(err, errNotFound) {
		return errNotFound
	}
	d[word] = definition
	return nil
}

func (d Dictionary) Delete(word string) error {
	_, err := d.Search(word)
	if errors.Is(err, errNotFound) {
		return errNotFound
	}
	delete(d, word)
	return nil
}