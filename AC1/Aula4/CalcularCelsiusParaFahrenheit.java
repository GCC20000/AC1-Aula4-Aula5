package Aula4;
import java.util.Scanner;

public class CalcularCelsiusParaFahrenheit {
    public static void main(String[] args) {

        //Converter Celsius para Fahrenheit

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");        
        double celsius = scanner.nextDouble();       
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
        
        scanner.close();
    }
    
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
