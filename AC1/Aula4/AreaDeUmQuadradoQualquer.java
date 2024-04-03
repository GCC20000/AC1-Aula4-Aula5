package Aula4;
import java.util.Scanner;

public class AreaDeUmQuadradoQualquer {
    public static void main(String[] args) {

        //Área de um quadrado

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        
        double area = calcularArea(lado);
        
        System.out.println("A área do quadrado é: " + area);
        
        scanner.close();
    }
    
    public static double calcularArea(double lado) {
        return lado * lado;
    }
}
