import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, m, d, total;

        System.out.println("Descreva abaixo a idade em anos, meses e dias que essa pessoa tem");
         
        System.out.print("Anos: ");
        a = sc.nextInt();

        System.out.print("Meses: ");
        m = sc.nextInt(); 
        
        System.out.print("Dias: ");      
        d = sc.nextInt();

        total = (a*365) + (m*30) + d;

        System.out.println("Essa pessoa viveu " + total + "dias!");

    }
}
