package Aula4;
import java.util.Scanner;

public class CalcularJurosSimples {
    public static void main(String[] args) {

        //Cálculo de juros simples

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor principal:");
        double capital = scanner.nextDouble();
        
        System.out.println("Digite a porcentagem da taxa de juros:");
        double taxaJuros = scanner.nextDouble();
        
        System.out.println("Digite o tempo (em anos):");
        double tempo = scanner.nextDouble();
        double juros = calcularJurosSimples(capital, taxaJuros, tempo);
        
        System.out.println("O valor dos juros é: " + juros);
        
        scanner.close();
    }
    
    public static double calcularJurosSimples(double capital, double taxaJuros, double tempo) {
        return (capital * taxaJuros * tempo) / 100;
    }
}
