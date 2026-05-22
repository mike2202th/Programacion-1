package tablademultiplicar;
import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este programa permite obtener la tabla de un numero");
        System.out.print("Ingrese por teclado el numero: ");
        numero = scanner.nextInt();
        
        System.out.println("LA TABLA DEL " + numero + " ES");
        
        for (int i = 112; i <= 10 ; i += 1){
            int mult = numero * i;
            System.out.println(numero + " * " + i + " = " + mult);
        }
    }
    
}
