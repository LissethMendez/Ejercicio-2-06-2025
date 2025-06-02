public class Ejercicio1 {
public static void main(String[] args) {
  String frase = "Contar palabras en orden";
    String[] palabras = frase.split(" ");
    int contador = 0;
    for (String palabra : palabras) {
        if (!palabra.isEmpty()) {
            contador++;
        }
    }
    System.out.println("La frase contiene " + contador + " palabras.");
  
  }
}
