import java.util.Scanner;

public class CalculaJurosInvestimento{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double doValorInicial;
        int inQuantidadeTempo;
        double doPorcentagemJuros;
        double doPorJur;
        double doBaseCalculo;
        int inMes;

        System.out.print("Valor inicial do investimento: ");
        doValorInicial = scanner.nextDouble();

        System.out.print("Tempo do investimento: ");
        inQuantidadeTempo = scanner.nextInt();

        System.out.print("Juros: ");
        doPorcentagemJuros = scanner.nextDouble();
        doPorJur = doPorcentagemJuros / 100;

        doBaseCalculo = doValorInicial;

        int T = 0;

        while(T < inQuantidadeTempo){
            
            doBaseCalculo = doBaseCalculo + (doBaseCalculo * doPorJur);
            inMes = T + 1;
            System.out.println("No " + inMes + "º mês o valor é de: " + doBaseCalculo);
            T = T + 1;

        }

    }
}