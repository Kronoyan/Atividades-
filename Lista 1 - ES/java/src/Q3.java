import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double v, vt;
        
        System.out.print("Qual foi o valor total da conta? ");
        v = sc.nextDouble();

        System.out.println("Serão incididos 10% sobre o valor total da conta");
        vt = v * 1.1;

        System.out.println(" O valor total da conta com os 10% foi de R$" + vt + " reais" );
    
    }

}
