/*Crie um programa em que o usuário insira a distância da viagem, a média de
consumo do carro e o preço unitário do combustível (álcool ou gasolina). O
programa deve calcular e exibir a quantidade de combustível necessária, o custo
total para o combustível selecionado, considerando o consumo do veículo.*/

import java.util.Scanner;

public class CalculaConsumo{

    public static void main (String[] args){

        //Inicializando o scanner para pegar valores digitados pelo usuário.
        Scanner scanner = new Scanner(System.in);

        //Definindo as variaveis que serão utilizadas no sistema criado.
        double doDistancia;
        double doLitroGasolina;
        double doLitroAlcool;
        double doConsumo;
        String stTipoCombustivel;
        double doValorLitroGasolina;
        double doValorLitroAlcool;
        double doValorTotal;

        //Informando valores, para caso o valor tipo de combustivel seja invalido;
        doConsumo = 0;
        doValorTotal = 0;

        //Informando os valores do Alcool e da Gasolina, dados tirados do Google.
        doValorLitroAlcool = 3.96;
        doValorLitroGasolina = 5.97;

        //Informando a capacidade do combustivel, dado retirado do Google.
        doLitroAlcool = 10;
        doLitroGasolina = 10;

        //Pedindo para o usuário informar a distancia em km e o tipo do combustivel.
        //e pegando essa informação com o scanner.
        System.out.print("informe a distancia em km: ");
        doDistancia = scanner.nextDouble();

        System.out.print("informe o tipo de combustivel: ");
        stTipoCombustivel = scanner.next();

        //Realizando a validação do tipo do combustivel utilizado.
        if(stTipoCombustivel.equalsIgnoreCase("Gasolina")){
            
            //Calculo da quantidade de litros a ser utilizado, e o valor total.
            doConsumo = doDistancia / doLitroGasolina;
            doValorTotal = doConsumo * doValorLitroGasolina;

        }else if (stTipoCombustivel.equalsIgnoreCase("Alcool")){

            doConsumo = doDistancia / doLitroAlcool;
            doValorTotal = doConsumo * doValorLitroAlcool;

        } else {
            //Caso o valor informado não seja compativel com os verificados, ele para aqui.
            stTipoCombustivel = "O tipo de combustivel " + stTipoCombustivel + " é invalido!";
        }

        // Apresentando os valores informados e calculados pelo sistema.
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Tipo de combustivel: " + stTipoCombustivel);
        System.out.println("Quantidade de Litros: " + doConsumo);
        System.out.println("Valor total da viagem: " + doValorTotal);

    }
}