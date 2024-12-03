package main

import (
	"fmt"
	"net/http"
	"os"
	"strings"
)

func validaCep(cep string) int {
	res, err := http.Get(fmt.Sprintf("https://viacep.com.br/ws/%s/json", cep))
	if err != nil {
		panic(err)
	}

	defer res.Body.Close()
	return res.StatusCode
}

func main() {
	cep := "85803730"
	fmt.Println(validaCep(cep))

	c, err := os.ReadFile("./nome.txt")
	if err != nil {
		panic(err)
	}

	ceps := strings.Split(string(c), "\n")

	for _, cep := range ceps {
		if cep == "" {
			continue
		}
	}

	status := validaCep(cep)
	if status == http.StatusOK {
		fmt.Printf("O CEP %s e valido! \n", cep)
	} else {
		fmt.Printf("O CEP %s e invalido ou nao encontrado. (Status: %d)\n", cep, status)
	}

}
