import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);

        int a, b, operacao;
        float resultado;

        System.out.println("Informe dois valores abaixo para começarmos o calculo!");
        System.out.println("\n");

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("\n");

        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();
        System.out.println("\n");

        System.out.println("Agora digite o numero indicado para a operação que você deseja fazer:");
        System.out.print(" 1 - Adição\n 2 - Subtração\n 3 - Multiplicaçao\n 4 - Divisao\n Qual valor voce escolheu?: ");
        operacao = sc.nextInt();
        System.out.println("\n");
        
        switch (operacao) {
            case 1: resultado = a + b;
                System.out.println(resultado);
                break;
                
            case 2: resultado = a - b;
                System.out.println(resultado);
                break;

            case 3: resultado = a * b;
                System.out.println(resultado);
                break;

            case 4: resultado = a / b;
                System.out.println(resultado);
                break;
        
            default:
                break;
        }
   
    }
} 
