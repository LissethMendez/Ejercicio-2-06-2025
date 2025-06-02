public class Ejercicio5 {
// Ejercicio 5: Contar la cantidad de veces que aparece la letra 'A' en una frase.
public static void main(String[] args) {
String frase = "La escuela Franciscana";
int contador = 0;

for (int i = 0; i < frase.length(); i++) {
    if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
        contador++;
    }
    

}
System.out.println("La letra 'A' aparece " + contador + " veces en la frase.");
}
}



