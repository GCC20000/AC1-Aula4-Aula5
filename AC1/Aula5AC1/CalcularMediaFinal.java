package Aula5AC1;
import java.util.Scanner;

public class CalcularMediaFinal {
    public static void main(String[] args) {

        //Calcular a média final de um aluno

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota da AC1: ");
        double ac1 = scanner.nextDouble();
        
        System.out.println("Digite a nota da AC2: ");
        double ac2 = scanner.nextDouble();
        
        System.out.println("Digite a nota da AG: ");
        double ag = scanner.nextDouble();
        
        System.out.println("Digite a nota da AF: ");
        double af = scanner.nextDouble();
        
        double mediaFinal = calcularMediaFinal(ac1, ac2, ag, af);
        
        System.out.println("A média final do aluno é: " + mediaFinal);
        
        scanner.close();
    }
    
    public static double calcularMediaFinal(double ac1, double ac2, double ag, double af) {
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }
}
