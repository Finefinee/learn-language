package url

import (
	"errors"
	"net/http"
)

var errRequestFailed = errors.New("request failed")

func CheckURLs(urls []string) map[string]string {
	results := map[string]string{}
	for _, url := range urls {
		result := "OK"
		err := HitURL(url)
		if err != nil {
			result = "FAILED"
		}
		results[url] = result
	}
	return results
}

func HitURL(url string) error {
	resp, err := http.Get(url)
	if err != nil || resp.StatusCode >= 400 {
		return errRequestFailed
	}
	return nil
}

