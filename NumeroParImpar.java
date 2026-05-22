package numeroparimpar;

import java.util.Scanner;

public class NumeroParImpar {

    public static void main(String[] args) {
       int a;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO POR CONSOLA PARA SABER SI ES PAR O IMPAR");
        a = scanner.nextInt();
        
        if (a % 2 == 0) System.out.println("EL NUMERO ES PAR");
        else System.out.println("EL NUMERO ES IMPAR");
    }
}
