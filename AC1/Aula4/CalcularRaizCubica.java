package Aula4;
import java.util.Scanner;

public class raizcubica {
    public static void main(String[] args) {

        //Raiz Cúbica

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a raíz cúbica: ");
        double numero = scanner.nextDouble();
        double raizCubica = Math.cbrt(numero);

        System.out.println("A raiz cúbica de " + numero + " é: " + raizCubica);
        
        scanner.close();
    }
}