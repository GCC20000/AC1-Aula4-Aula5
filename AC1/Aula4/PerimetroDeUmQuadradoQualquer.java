package Aula4;
import java.util.Scanner;

public class PerimetroDeUmQuadradoQualquer {
    public static double calcularPerimetro(double lado) {
        return 4 * lado;
    }
    public static void main(String[] args) {

        //Perímetro de um quadrado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        double perimetro = calcularPerimetro(lado);
        
        System.out.println("O perímetro do quadrado é: " + perimetro);
        
        scanner.close();
    }
    
    
}
