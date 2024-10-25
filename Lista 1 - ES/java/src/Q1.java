import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int c; 
        double fah;
    
        System.out.print("Digite aqui a temperatura em graus Celsius: ");
        c = sc.nextInt();

        fah = (( 9*c ) + 160 ) / 5;

        System.out.print("O valor de conversão para o valor informado é: " + fah + " °Fahrenheit");
        
    }
    
}
