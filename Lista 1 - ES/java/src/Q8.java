import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int vl, n50, n10, n5, n1; 

        System.out.println("Bem-vindo ao NiuBenk!");

        System.out.print("Digite o valor que você irá sacar: ");
        vl = sc.nextInt();

        System.out.println("Agora veremos quantas notas sairão do caixa eletrônico");
        
        n50 = vl/50;
        vl = vl%50;

        n10 = vl/10;
        vl = vl % 10;

        n5 = vl/5;
        vl = vl%5;

        n1 = vl%5;

        System.out.println("Sairão " + n50 + " notas de 50 reais ");
        System.out.println("Sairão " + n10 + " notas de 10 reais ");
        System.out.println("Sairão " + n5 + " notas de 5 reais ");
        System.out.println("Sairão " + n1 + " notas de 1 real ");
        
    }
    
}
