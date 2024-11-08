import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);

        int idade;  

        System.out.println("Vamos saber se você está apto para votar!");

        System.out.print("Insira sua idade: ");
        idade = sc.nextInt();
        System.out.println("\n");

        System.out.println("Agora vamos saber se você está apto!"); 
        System.out.println("\n");

        if (idade <= 15) {
            System.out.println("Você ainda não pode votar!");
        } else {
            if (idade >=16 && idade <=17) {
               System.out.println("Você não é obrigado a votar");
            } else {
               if (idade >= 18 && idade <= 64) {
                System.out.println("Você é obrigado a votar! ");
                
               } else {
                System.out.println("Vôce não é obrigado a votar!");
               } 
            }
        }   
    }
}    