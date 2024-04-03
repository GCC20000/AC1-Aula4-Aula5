package Aula4;
import java.util.Scanner;

public class perimetroretangulo {
    public static void main(String[] args) {
        
        //Perímetro de um retângulo

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        double perimetro = 2 * (comprimento + largura);

        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();
    }
}
