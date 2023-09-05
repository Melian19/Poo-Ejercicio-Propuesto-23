import java.util.Scanner;

public class PooEj23 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        System.out.println("Ingrese primer valor:");
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        System.out.println("Ingrese segundo valor:");
        double b = entrada.nextDouble();
        System.out.println("Ingrese tercer valor:");
        double c = entrada.nextDouble();
        entrada.close();
        
        double x = Math.pow(b, 2) - 4*a*c;
        double y = Math.sqrt(x);

        if (x>0){
            double solucion1 = (-b + y)/2*a;
            double solucion2 = (-b - y)/2*a;
            System.out.println("La ecuacion tiene soluciones reales distintas");
            System.out.println("Las soluciones posibles de la ecuacion son:" + "\nx1 = "+solucion1 + "\nx2 = "+solucion2);
        }else if(x==0){
            double solucion1 = (-b + y)/2*a;
            double solucion2 = (-b - y)/2*a;
            System.out.println("La ecuacion tiene soluciones reales iguales");
            System.out.println("Las soluciones posibles de la ecuacion son:" + "\nx1 = "+solucion1 + "\nx2 = "+solucion2);
        }else{
            System.out.println("La ecuacion no posee soluciones reales");
        }
    }
}