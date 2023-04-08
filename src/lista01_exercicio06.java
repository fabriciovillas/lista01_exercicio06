import java.util.Scanner;
public class lista01_exercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double area, raio;

        System.out.println("Digite o raio do circulo: ");
        raio = input.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        
    
    }
}
