import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
       
        int a, b;

        System.out.println("Insira abaixo dois valores para sabermos se eles são divisiveis!");
        System.out.println("\n");
        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        System.out.println("\n");

    
        if (a%b==0) {
            System.out.println(a + " é divisivel por " + b);
        } else {
            System.out.println(a + " não é divisivel por " + b);
        }
         
    }
}    