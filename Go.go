//Comandos básicos
/*
	
	go mod init (NOME PROJETO) = Inicia o projeto
	go run (NOME PROJETO) = roda o programa
	
*/

package main

import "fmt"

//Exemplo de uso das variaveis e seus tipos:

func main() {
	var idade = 28
	var float64 = 1.78
	var nome = "Gustavo"
	var gostaDeEspostes bool = true

	fmt.Println("Idade: ", idade)
	fmt.Println("Altura: ", float64)
	fmt.Println("Nome: ", nome)
	fmt.Println("Gosta de Esportes: ", gostaDeEspostes)
}

//Exemplo de for:

func main(){
for i := 1; i <= 5; i++ {
		fmt.Println("Número: ", i)
	}
}

//Exemplo Função com retorno
func dizerOla() {
	fmt.Println("Ola world")
}

func main() {
	dizerOla()
}

//Exemplo Função para realiza uma ação
func somar(a int, b int) int {
	return a + b
}

func main() {
	r := somar(1, 2)
	fmt.Println("A soma é: ",r)
}

//Exemplo para apresentar um dado de dentro da main

func saudar(nome string) {
	fmt.Println("Saudações ", nome)
}

func main() {
	saudar("Gustavo")
	saudar("João")
}

// jogo de adivinhação

func main() {
	//gerar numeros randomico
	numeroSecreto := rand.intn(100) + 1
	fmt.Println(numeroSecreto)
}

//loop infinito
for {
	//pegar o valor do terminal
	fmt.Println("Digite um valor")
	var palpite intn
	fmt.Println(&palpite)
	fmt.Println(palpite)
}

// jogo de adivinhação

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

// ler aquivo de texto

package main

import (
	"fmt"
	"os"
	"strings"
)

func main() {
	c, err := os.ReadFile("./nome.txt")
	if err != nil {
		panic(err)
	}

	fmt.Println(c)
	fmt.Println("-----=-----")

	asd := strings.Split(string(c), "\n")
	fmt.Println(asd)

}