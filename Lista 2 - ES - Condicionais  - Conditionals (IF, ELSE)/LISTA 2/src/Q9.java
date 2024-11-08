import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int homem1, homem2, mulher1, mulher2,hv,hn,mv,mn, resultadodasomas1,resultadodasomas2;

        System.out.println(" Escreva os dados abaixo para o calculo que se pede:");
        System.out.print("Idade do primeiro homem: ");
        homem1 = sc.nextInt();
        System.out.print("Idade do segundo homem: ");
        homem2 = sc.nextInt();

        if (homem1 > homem2) {
            hv = homem1; 
            hn = homem2;
        } else {
            hv = homem2;
            hn = homem1;   
        }

        System.out.print("Idade da primeira mulher: ");
        mulher1 = sc.nextInt();
        System.out.print("Idade da segunda mulher: ");
        mulher2 = sc.nextInt();

        if (mulher1 > mulher2) {
            mv = mulher1; 
            mn = mulher2;
        } else {
            mv = mulher2;
            mn = mulher1;   
        }

        System.out.println("Agora vamos somar a idade do homem mais velho com a mulher mais nova!");
        resultadodasomas1 = hv + mn;
        System.out.println("O resultado é " + resultadodasomas1);

        System.out.println("\n");

        System.out.println("Agora vamos somar a idade do homem mais novo com a mulher mais velha!");
        resultadodasomas2 = hn + mv;
        System.out.println("O resultado é " + resultadodasomas2);

    }
} 