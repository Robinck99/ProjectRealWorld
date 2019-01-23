package main

import (
	"fmt"
	"html/template"
	"net/http"
)

func rootHandler(w http.ResponseWriter, r *http.Request) {
	fmt.Println("method:", r.Method) //get request method
	var searchedElemnt string
	if r.Method == "GET" {
		t, _ := template.ParseFiles("home.gtpl")
		_ = t.Execute(w, nil)
	} else {
		_ = r.ParseForm()
		searchedElemnt = r.Form["searchElement"][0]
		fmt.Println("searched Elemnt:", searchedElemnt)
	}
}

func main() {
	mux := http.NewServeMux()
	mux.HandleFunc("/", rootHandler)

	fileServer := http.FileServer(http.Dir("./img"))
	mux.Handle("/img/", http.StripPrefix("/img", fileServer))

	//http.Handle("/", http.FileServer(http.Dir("./")))
	_ = http.ListenAndServe(":8000", mux)
}
