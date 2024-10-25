import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int smr, qtsm, sal;

        System.out.println("Iremos calcular quantos salarios minimos você recebe. Abaixo insira o salario minimo vigente");
        smr = sc.nextInt();

        System.out.print("Digite o seu salario: ");
        sal = sc.nextInt();

        System.out.println("Agora iremos calcular quantos salarios você recebe");
        qtsm = sal/smr;

        System.out.println("Você recebe " + qtsm + " salario(s) minimo(s)");

    }   

}
