package main

import (
	"fmt"
	"math/rand"
)

func geraNumeroSecreto(nun int) int {
	//gerar numeros randomico
	n := rand.Intn(nun) + 1
	return n
}

func main() {
	num := geraNumeroSecreto(50)

	for { //loop infinito
		fmt.Println("Digite um valor")
		var palpite int
		fmt.Scan(&palpite)

		if palpite > num {
			fmt.Println("Muito Alto! Tente um número menor.")
		} else if palpite < num {
			fmt.Println("Muito baixo! Tente um número maior. ")
		} else {
			fmt.Println("Congrats my friendo!!")
			break
		}

	}

}
