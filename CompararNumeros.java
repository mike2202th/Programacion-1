package compararnumeros;
import java.util.Scanner;
public class CompararNumeros {

    public static void main(String[] args) {
        int a, b;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE DOS NUMEROS POR CONSOLA PARA SABER CUAL ES EL MAYOR");
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        if (a > b) System.out.println(a + " es mayor que " + b);
        else if (b > a) System.out.println(b + " es mayor que " + a);
        else System.out.println("Los numeros ingresados son iguales");
    }  
}
