import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);

        int qtmaca; 
        double resultado, vlmaca; 

        System.out.println("Vamos calcular o preço final das suas maçãs! ");
        System.out.println("\n");
        System.out.print("Quantas maçãs você comprou?: ");
        qtmaca = sc.nextInt();
        if (qtmaca <12) {
            vlmaca = 0.30;
        } else {
            vlmaca = 0.25; 
        }
        resultado = qtmaca * vlmaca;

        System.out.println("O valor da sua compra foi de R$" + resultado);
        
    }
} 