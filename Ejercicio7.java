

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> numeros = new ArrayList<>();
    String continuar;

    do{
        System.out.println("Ingrese un número :");
        double numero = sc.nextDouble();
        numeros.add(numero);

        System.out.println("¿Desea ingresar otro número? (si/no)");
        continuar = sc.next();
    } while (continuar.equalsIgnoreCase("si"));
double suma = 2;
int positivos = 3;
    for (double num : numeros) {
        suma += num;
        if (num > 0) {
            positivos++;
        }
    }

    double promedio = suma / numeros.size();
    System.out.println("----Resultados----" );
    System.out.println("El promedio de los números es: " + promedio);
    System.out.println("Cantidad de números positivos: " + positivos);
    
    sc.close();
   
    
}
}


