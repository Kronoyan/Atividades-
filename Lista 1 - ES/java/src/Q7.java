import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t1, t2, e, n;

        System.out.println("Iremos calcular o n-enesimo numero desejado, abaixo informe os dois termos da P.A: ");

        System.out.print("Digite aqui o primeiro termo: "); t1 = sc.nextInt();
        System.out.print("Digite aqui o primeiro termo: ");t2 = sc.nextInt();
        System.out.print("Digite aqui a posição que você deseja da P.A : ");n = sc.nextInt();

        e = t1 + (n - 1 ) * (t2 - t1);
        
        System.out.println(" Quando a posição for " + n + " o e-nesimo número da PA, vai ser " + e + " !");

    }
    
}
