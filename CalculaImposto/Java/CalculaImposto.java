import java.util.Scanner;

public class CalculaImposto{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double doRendaMensal;
        double doRendaAnual;
        int inQuantDep;
        double doValDep;
        double doDeducao;
        double doValImp;
        double doBasCalc = 0;
        double doImposto;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Renda Mensal: ");
        doRendaMensal = scanner.nextDouble();

        doRendaAnual = doRendaMensal * 12;

        System.out.print("Quantidade de Dependentes: ");
        inQuantDep = scanner.nextInt();

        doValDep = inQuantDep * (300 * 12);

        System.out.print("Outras deduções: ");
        doDeducao = scanner.nextDouble();

        doBasCalc = doRendaAnual - doValDep - doDeducao;

        if(doBasCalc < 18000.00){
        
            doValImp = 0;

        } else if (doBasCalc < 27000.00){
            
            doImposto = doBasCalc - 18000;

            doValImp = doImposto * 0.15;

        } else{ 
            
            doImposto = doBasCalc - 27000;

            doValImp = doImposto * 0.275 + 1350;
            
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Rendimento Anual: " + doRendaAnual);
        System.out.println("Base de Cálculo: " + doBasCalc);
        System.out.println("Valor do imposto: " + doValImp);
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");

    }

}