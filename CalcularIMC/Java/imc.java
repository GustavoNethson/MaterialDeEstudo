import java.util.Scanner;

public class imc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double doAltura;
        double doPeso;
        double doValorAltura;
        double doValImc;
        String stResultado;
        String stSexo;
        String stSexoExtenco;

        System.out.print("Informe sua altura em Cm: ");
        doAltura = scanner.nextDouble();

        System.out.print("Informe seu peso em Kg: ");  
        doPeso = scanner.nextDouble();

        System.out.print("Informe o seu Sexo: ");
        System.out.println("Sendo (M) para Masculino e (F) para Feminino");
        stSexo = scanner.next();
        

        doValorAltura = (doAltura / 100.0) * (doAltura / 100.0); 
        doValImc = doPeso / doValorAltura;
    
        if(stSexo.equalsIgnoreCase("M")){
            
            stSexoExtenco = "Masculino";

            if (doValImc < 20.70) {
                stResultado = "Abaixo do peso";
            } else if (doValImc < 26.40) {
                stResultado = "Peso normal";
            } else if (doValImc < 27.80){
                stResultado = "Marginalmente acima do peso";
            } else if (doValImc < 31.10) {
                stResultado = "Acima do peso ideal";
            } else {
                stResultado = "Obeso";
            }
            
        }else if (stSexo.equalsIgnoreCase("F")){
            
            stSexoExtenco = "Feminino";
            
            if (doValImc < 19.10) {
                stResultado = "Abaixo do peso";
            } else if (doValImc < 25.80) {
                stResultado = "Peso normal";
            } else if (doValImc < 27.30){
                stResultado = "Marginalmente acima do peso";
            } else if (doValImc < 32.30) {
                stResultado = "Acima do peso ideal";
            } else {
                stResultado = "Obesa";
            }
           

        }else {

            stResultado = "Valor do sexo informado é invalido!";
            stSexoExtenco = "Valor não existente";

        }

        System.out.println("--------------------------------------------------");
        System.out.println("IMC: " + doValImc);
        System.out.println("Resultado: " + stResultado);
        System.out.println("Sexo: " + stSexoExtenco);

        scanner.close();
    }
}
