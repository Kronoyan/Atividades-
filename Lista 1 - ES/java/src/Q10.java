import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hi, mi, si;
        int hf, mf, sf;
        int ti, tf, ss;
        int ht, mt, st;

        System.out.println("Bem vindos a calculadora de tempo de atividade, nela você vai saber quantas horas você estava praticando algo");
        System.out.println("\n\n");

        System.out.println("Insira respectivamente a hora, minuto e segundos do inicio da sua atividade: ");
        hi = sc.nextInt(); mi = sc.nextInt(); si = sc.nextInt();
        System.out.println("\n\n");

        System.out.println("Otimo agoara insira respectivamente a hora, minuto e segundos do fim da sua atividade: ");
        hf = sc.nextInt(); mf = sc.nextInt(); sf = sc.nextInt();

        ti = (hi * 3600) + (mi * 60) + si; 
        tf = (hf * 3600) + (mf * 60) + sf; 
        ss = tf - ti ;
        
        ht = ss / 3600;
        ss = ss % 3600;
        
        mt = ss / 60;
        ss = ss % 60;

        st = ss;

        System.out.println(" Você passou " + ht + " horas, " + mt + " minutos e  " + st + " segundos praticando essa atividade");

    }

}

