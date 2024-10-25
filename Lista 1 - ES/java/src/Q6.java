import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3;
        int p1, p2, p3;
        int media;

        System.out.println("Informe as notas abaixo:");
        System.out.print("Digite aqui nota 1: ");n1 = sc.nextInt(); System.out.print("Digite aqui nota 2: "); n2 = sc.nextInt(); System.out.print("Digite aqui nota 3: "); n3 = sc.nextInt();
        
        System.out.println("Informe os pesos das notas abaixo:");
        System.out.print("Digite aqui o peso da nota 1: ");p1 = sc.nextInt(); System.out.print("Digite aqui o peso da nota 2: "); p2 = sc.nextInt(); System.out.print("Digite aqui peso da nota 3: "); p3 = sc.nextInt();
        
        media = ((p1*n1) + (p2*n2) + (p3 * n3)) / (p1 + p2 + p3);
        
        System.out.println("A media ponderada para os valores informados são/é: " + media + " ponto(s)");
        
    }
    
}
