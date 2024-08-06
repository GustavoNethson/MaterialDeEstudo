import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args) {
        
        //Iniciando o scanner para receber os valores informados pelo usuário
        Scanner scanner = new Scanner(System.in);

        //Definir as variaveis a serem utilizadas
        Double doNumeroUm;   // Primeiro valor digitado
        Double doNumeroDois; // Segundo valor digitado
        Double doResultado;  // Valor que vai receber o resultado da operação
        String stOperador;  // Valor que vai receber o operador do cálculo

        System.out.print("");
        doNumeroUm = scanner.nextDouble();

        System.out.print("");
        stOperador = scanner.next();

        System.out.print("");
        doNumeroDois = scanner.nextDouble();

        switch (stOperador) {
            case "+":
                doResultado = doNumeroUm + doNumeroDois;
                break;
            case "-":
                doResultado = doNumeroUm - doNumeroDois;
                break;
            case "/":
                if (doNumeroDois != 0) {
                    doResultado = doNumeroUm / doNumeroDois;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return;
                }
                break;
            case "*":
                doResultado = doNumeroUm * doNumeroDois;
                break;
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
            }

        System.out.println(doResultado);

    }

}