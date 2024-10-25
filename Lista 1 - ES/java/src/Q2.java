import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m, s, total;

        System.out.println("Descreva nas linhas abaixo consecutivamente a hora, os minutos e segundos para a conversão");
        
        System.out.print("Horas: ");
        h = sc.nextInt();

        System.out.print("Minutos: ");
        m = sc.nextInt(); 
        
        System.out.print("Segundos: ");      
        s = sc.nextInt();

        total = (h*3600) + (m*60) + s;
        System.out.println(" Com base na hora informada já se passaram " + total + " segundos do dia!");
        
    }

}
