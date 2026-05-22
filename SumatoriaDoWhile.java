package sumatoriadowhile;

public class SumatoriaDoWhile {
    public static void main(String[] args) {
        int suma = 0, numero = 0;
        
        System.out.print("La sumatoria de los primeros 50 numeros es: ");
        
        do{
            suma = suma + numero;
            numero += 1;
    }while(numero <= 50);
        System.out.println(suma);
    }
    
}
