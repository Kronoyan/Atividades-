import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);

        int idade;

        System.out.println("Abaixo, informe a sua idade para sabermos qual a sua categoria! ");
        System.out.print("Insira aqui sua idade: ");
        idade = sc.nextInt();

        if (idade >= 5 && idade <=7) {
            System.out.println("Sua categoria é INFANTIL A");
        } else {
            if (idade >= 8 && idade <=10) {
                System.out.println("Sua categoria é INFANTIL B");
            } else {
                if (idade >=11 && idade <=13) {
                    System.out.println("Sua categoria é JUVENIL A");
               } else {
                    if (idade >=14 && idade <=17) {
                    System.out.println("Sua categoria é JUVENIL B");
                } else {
                    if (idade >= 18) {
                        System.out.println("Sua categoria é SENIOR");
                    } else {
                        System.out.println("Voce nao pode competir, por nao ter categoria");
                    }
                }
               } 
            }
        }
    }
} 