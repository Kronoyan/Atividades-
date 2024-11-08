import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
         
        int sexo;
        double altura, pesoideal=0;

        System.out.println("Vamos calcular o seu peso ideal de acordo com algumas informações");
        System.out.println("\n");

        System.out.print("Qual seu sexo? MASCULINO - digite 1 / FEMININO - Digite 2: ");
        sexo = sc.nextInt();
        System.out.println("\n");

        System.out.print("Agora precisamos saber sua altura: ");
        altura = sc.nextDouble();
        System.out.println("\n");

        if (sexo == 1) {
            pesoideal = 62.1 * altura - 44.7;
        } else {
            if (sexo == 2) {
                pesoideal =  (72.7 * altura) - 58;
            }
            
        }

        System.out.printf("Seu peso ideal é " + pesoideal + "Kg");
        
    }
} 
