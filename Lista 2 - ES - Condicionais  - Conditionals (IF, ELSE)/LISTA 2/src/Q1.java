import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int anodenasc, anovig, resultado;

        System.out.println("Bem vindo, vamos saber se você está apto para votar este ano!  ");
        System.out.print("Em que ano nós estamos?: ");
        anovig = sc.nextInt();
        System.out.println("\n");

        System.out.println("Perfeito, estamos em " + anovig + " agora precisamos saber o ano de seu nascimento!");
        System.out.println("\n");

        System.out.print("Qual o ano de seu nascimento?: ");
        anodenasc = sc.nextInt();

        resultado = anovig  - anodenasc;

        if (resultado >= 16) {
            System.out.println("Você está apto para votar!");
        } else {
            System.out.println("Você ainda não está apto para votar!");
        }
   
    }
}
