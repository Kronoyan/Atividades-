import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);

        int salariobruto, prestacao;

        System.out.println("Olá! Vamos ver se seu salario lhe permite conceder o emprestimo desejado");
        System.out.println("\n");

        System.out.print("Insira por favor o seu salario bruto: ");
        salariobruto = sc.nextInt();
        System.out.println("\n");

        System.out.print("Agora insira a prestação desejada: ");
        prestacao = sc.nextInt();
        System.out.println("\n");

        if (salariobruto * 0.3 >= prestacao) {
            System.out.println("Podemos lhe conceder o crédito");
        } else {
            System.out.println(" Infelizmente não podemos lhe conceder o crédito");
        }

    } 
} 