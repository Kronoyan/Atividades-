import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int qdft, val; 
        double fatan, mm, tff;

        System.out.print("Digite aqui a quantidade de fitas presente na locadora: ");qdft = sc.nextInt(); System.out.print("Digite aqui o valor do aluguel das fitas: ");val = sc.nextInt();
        
        System.out.println("\n\n\n");
       

        System.out.println("---------------------------------------RELÁTORIO---------------------------------------");
        System.out.println("\n\n\n");
        
        System.out.println("Abaixo vamos mostrar o faturamento anual da empresa");
        fatan = ((qdft * val) * 0.3) * 12;
        System.out.println("Neste ano tivemos um faturamento de  R$" + fatan + "por mês");
        System.out.println("\n\n");
        System.out.println("Agora vamos calcular o valor das multas com as fitas entregues por atraso");
        mm = ((qdft * 0.3) * 0.1) * (val * 0.1);
        System.out.println("O valor de multas por mês é de R$" + mm + " reais");
        System.out.println("\n\n");
        System.out.println("Durante o ano tiveram perdas e para isso foi feita uam reposição, abaixo teremos a quantidade de fitas totais");
        tff = ((qdft * 0.1) + (qdft)) - (qdft * 0.02 ); 
        System.out.println("A quantidade de fitas no final do ano será de " + tff + " fitas ");
 
    }

}

