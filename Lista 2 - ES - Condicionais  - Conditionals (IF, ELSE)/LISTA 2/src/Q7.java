import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int perimetro, lados, tamanhodolado;

        System.out.println("Vamos verificar as condiçoes de alguns poligonos");
        System.out.println("\n");   

        System.out.print("Informe quantos lados poligono tem: ");
        lados = sc.nextInt();
        System.out.println("\n");

        System.out.print("Agora informe o valor de um dos lados do poligono: ");
        tamanhodolado = sc.nextInt();
        System.out.println("\n");

        switch (lados) {
            case 3: perimetro = lados*tamanhodolado;
                System.out.println("Esse poligono é um triangulo e possui "+ perimetro + "cm de perimetro");
                break;
            case 4: perimetro = lados*tamanhodolado;
                System.out.println("Esse poligono é um quadrado e possui "+ perimetro + "cm de perimetro");
                break;
            case 5: perimetro = lados*tamanhodolado;
            System.out.println("Esse poligono é um pentagono e possui "+ perimetro + "cm de perimetro");    
            default:
            System.out.println("Com esse dado não conseguimos prosseguir");
                break;
        }
        
    }
} 
